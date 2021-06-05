package movingrectangle;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;

public class Main extends JPanel {

	Robot robo1;
	int thrustx;
	int velocityx;
	int oldError;
	boolean done = false;
	int steps = 0;
	int previousSteps = 1000;
	double p = 0;

	// Creates a robot starting at (0,0).
	public Main() {
		robo1 = new Robot();
	}

	// Calculates the number of steps corresponding to a value p
	private int calculateSteps(double p) {
		int currentxcoord = 0;
		int velocityx = 0;
		int steps = 0;
		while (true) {
			int error = 400 - currentxcoord;
			int thrust = (int) (error * p);
			velocityx += thrust;
			velocityx *= 0.9;
			currentxcoord = velocityx + currentxcoord;
			if (error < 10 && Math.abs(velocityx) < 1) {
				return steps;
			} else if (steps > 50) {
				return 50;
			}
			steps++;
		}

	}

	// From a range of 0-10, find the lowest number of steps and its value of p.
	public double getTheBestP() {
		int previousSteps = 1000;
		double previousP = 0;
		while (p < 10) {
			p += 0.01;
			int currentSteps = calculateSteps(p);
			if (currentSteps < previousSteps) {
				previousSteps = currentSteps;
				previousP = p;
			}
		}
		return previousP;
	}

	public void paintComponent(Graphics g) {
		robo1.erase(g);
		robo1.move(velocityx, 0);
		robo1.draw(g);
		int xgoal = 400;

		// create the goal line
		g.fillRect(xgoal, 100, 10, 400);
		int currentxcoord = robo1.getXcoord();
		int error = xgoal - currentxcoord;
		int thrust = (int) (error * p);
		velocityx += thrust;
		velocityx *= .9;
		steps++;
		if (error < 10 && Math.abs(velocityx) < 1 && done == false) {
			System.out.println("It took " + steps + " steps to finish with p " + p);
			done = true;
			try {
				Thread.sleep(400000);
			} catch (InterruptedException e) {
				System.out.println("Oh, we had an error");
			}
		} else {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				System.out.println("Oh, we had an error");
			}
		}
		repaint();
	}

	public void setP(double p) {
		this.p = p;
	}

	public static void main(String[] args) {
		Main myPanel = new Main();
		JFrame frame = new JFrame("Welecome to JavaTutorial.net");
		double p = myPanel.getTheBestP();
		myPanel.setP(p);

		// Only here start painting
		frame.getContentPane().add(myPanel);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}
}
