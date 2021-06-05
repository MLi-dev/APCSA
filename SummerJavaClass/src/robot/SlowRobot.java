package robot;

import java.awt.Color;

public class SlowRobot extends SuperRobot {

	public SlowRobot(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	// this *changes* the position
	public void move(int dx, int dy) {
		int newspeed = dx / 2;
		x = x + newspeed;
		y = y + dy;
	}
}
