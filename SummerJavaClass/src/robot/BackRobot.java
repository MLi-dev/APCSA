package robot;

import java.awt.Color;

public class BackRobot extends SuperRobot {

	public BackRobot(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	// this *changes* the position
	public void move(int dx, int dy) {
		int newspeed = dx;
		x = x + newspeed;
		y = y + dy;
	}
}