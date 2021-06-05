package robot;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Robot extends JPanel {
	int[][] grid = new int[10][10];
	private int x;
	private int y;
	private boolean hasArrived = false;
	static int panelWidth = 400;
	static int panelLength = 400;
	Random rand = new Random();
	int targetX = rand.nextInt(9) + 1;
	Random randY = new Random();
	int targetY = randY.nextInt(9) + 1;

	public Robot() {
		x = 0;
		y = 0;
	}

	public void draw(Graphics g) {
		if (x < targetX * 40) {
			g.fillRect(x++, y, 40, 40);
		} else if (y < targetY * 40) {
			g.fillRect(x, y++, 40, 40);
		} else {
			g.fillRect(x, y, 40, 40);
			hasArrived = true;
		}
	}

	public void drawTarget(Graphics g) {

		g.setColor(Color.red);
		g.fillRect(targetX * 40, targetY * 40, 40, 40);

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		draw(g);
		if (!hasArrived) {
			drawTarget(g);
		}
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();

	}

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Welcome to Robot park!");
		jFrame.getContentPane().add(new Robot());
		jFrame.setSize(panelWidth, panelLength + 20);
		jFrame.setVisible(true);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

//Questions to Ask teacher: 
// 1. If I am going to use multiple robots, should they all move to one target, or should there also be multiple targets? 
// 2. Using inheritance, does that mean the subclasses inherit from robot class? (Ex: I can give different speed, color to subclass robots). 
//3. What is control theory? How would I apply to this project? 
