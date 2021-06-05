package robot;

import java.awt.Color;

public class FastRobot extends SuperRobot {


	public FastRobot(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}


	// this *changes* the position
	public void move(int dx, int dy) {
		x = x + (2 * dx);
		y = y + dy;
	}
}
