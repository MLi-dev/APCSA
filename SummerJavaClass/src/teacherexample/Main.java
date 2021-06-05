package teacherexample;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;

public class Main extends JPanel {

// so we are faced with a dillema:
// We need g to create an instance of a Robot
// but that is only available via a call to paintComponent
// but that creates multiple instance, when we 
// only want one!!
//  We thought we could address this in the creation of
// the one instnace of Main, but that constructor
// does not have access to the Graphics object either.

// We believe there may be an init method that
// goes with the paintComponent as something suppplied
// to use just as paintComponent is.......

// But when we look at how Graphics objects are used
// we see that they are virtually always psssed at the user
// level --- you do not get to keep a Graphics around
// for multiple draws.

	Robot robo1;
	RotatingRobot wheely;
	int thrustx;
	int velocityx;
	int oldError;
	boolean done = false;
	int steps = 0;
	double inc;
	int xgoal = 400;

// overrides a stub of a paintComponent method

	public void paintComponent(Graphics g) {

		/*
		 * int xgoal = 400; // not in the loop!
		 * 
		 * int position = robo1.getxpostion();
		 * 
		 * int error = goal - position;
		 * 
		 * double kp = .1; int thrust = kp * error; int velocityx += thrust; velocityx
		 * *= 0.9; xposition += velocity;
		 */

		// loop for p from .03 up to a value TBD
		// we increase p by an amount determined by the scale
		// the system can tolerate

		// suppose the high value for p is 2

		// suppose we find the computer takes one minute
		// to iterate 100 times (that is pretty slow)


			double p = 0.1;
			robo1.erase(g); // graphics
			robo1.move(velocityx, 0); // in the loop
			robo1.draw(g); // graphics

			// create the goal line
			g.fillRect(xgoal, 100, 10, 400); // graphics
			int currentxcoord = robo1.getXcoord(); // in the loop
			int error = xgoal - currentxcoord; // in loop

			int thrust = (int) (error * p); // in the loop

			velocityx += thrust; // in the loop
			velocityx *= .9; // friction in the loop
			steps++; // hmmmm so this is also an iterating variable
			// for a loop inside the one that varies p

			// this needs to be inside both loops
			if (error < 10 && Math.abs(velocityx) < 1 && !done) {
				System.out.println("It took " + steps + " steps to finish");
				System.out.println(error);
				done = true;
				// if we get here we need to reset steps to zero
			}

		// nothing after this needs to be in a loop
		try {

			Thread.sleep(40);
		} catch (InterruptedException e) {
			System.out.println("Oh, we had an error");
		}
		repaint();
		
	}

	// constructor for Main (not the main method)

	public Main() {

		// More on PID loops
		// What does I do?
		// Introduction to recurrence relations
		//
		// inheritance
		// Multiple kinds of robots (or their parts)
		// 2 d arrays
		// Row major vs. column major

		robo1 = new Robot();
		wheely = new RotatingRobot();

		Robot[][] robotgrid = new Robot[5][2];

		/// Still at least one issue
		for (Robot[] rRow : robotgrid) {
			for (Robot r : rRow) {
				r = new Robot();

				r.setThrustx(0);
				r.setVelocityx(0);
				r.setOldError(0);
			}

			ArrayList<Object> robotal = new ArrayList<Object>();

			for (int i = 0; i < 5; i++) {
				robotal.add(new Robot());
			}

		}

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Welecome to JavaTutorial.net");
		Main myPanel = new Main();
		frame.getContentPane().add(myPanel);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}
