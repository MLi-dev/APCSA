package robot;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Controller extends JPanel {
	int[][] grid = new int[10][10];
	boolean arrived = false;
	List<SuperRobot> robotList = new ArrayList<SuperRobot>();
	String lane;

	public Controller() {
		RobotFactory robotFactory = new RobotFactory();
		List<String> positionList = generatePosition();

		for (int i = 0; i < positionList.size(); i++) {
			robotList.add(robotFactory.getRobot(positionList.get(i)));
		}
	}

	public void drawTarget(Graphics g) {

		g.setColor(Color.red);
		g.fillRect(390, 0, 10, 400);
		g.drawString("Lane1", 350, 40);
		g.drawString("Lane2", 350, 120);
		g.drawString("Lane3", 350, 200);
		g.drawString("Lane4", 350, 280);

	}

	public List<String> generatePosition() {
		ArrayList<String> robotPosition = new ArrayList<String>(5);
		robotPosition.add("FAST");
		robotPosition.add("SLOW");
		robotPosition.add("NORMAL");
		robotPosition.add("STUCK");

		Collections.shuffle(robotPosition);
		return robotPosition;
	}

	public void paintComponent(Graphics g) {
		if (!arrived) {
			drawTarget(g);
			for (int i = 0; i < robotList.size(); i++) {
				SuperRobot temp = robotList.get(i);
				temp.setY(i * 80);
				temp.move(10, 0);
				temp.draw(g);
				if (temp.getXcoord() >= 400) {
					arrived = true;
					lane = RaceLane.getLane(i * 80);

				}

			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			boolean odd = true;
			for (int i = 0; i < 10; i++) {
				odd = !odd;
				for (int j = 0; j < 10; j++) {
					odd = !odd;
					if (odd == true) {
						g.setColor(Color.WHITE);
						g.drawString(lane, i * 40, j * 40 - 20);
					} else {
						g.setColor(Color.GRAY);
					}
					g.fillRect(i * 40, j * 40, 40, 40);
				}
			}
			// g.drawString("Game Over! The winner is " + lane, 100, 200);
		}
		repaint();

	}

}
