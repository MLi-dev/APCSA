package robot;

import java.awt.Color;
import java.awt.Graphics;

public class SuperRobot {
	protected int x;
	protected int y;
	protected Color robotColor;

	public SuperRobot(Color c) {
		this.robotColor = c;
		x = 0;
		y = 0;

	}

	public Color getRobotColor() {
		return robotColor;
	}

	public void setRobotColor(Color robotColor) {
		this.robotColor = robotColor;
	}

	public int getXcoord() {
		return this.x;
	}

	public int getYcoord() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// this *changes* the position
	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	// we need to make sure to set the robot color to the robotcolor!
	public void draw(Graphics g) {
		g.setColor(robotColor);
		g.fillRect(x, y, 40, 40);

	}

}
