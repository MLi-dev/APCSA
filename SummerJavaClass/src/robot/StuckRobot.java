package robot;

import java.awt.Color;

public class StuckRobot extends SuperRobot {

	public StuckRobot(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	// this *changes* the position
	public void move(int dx, int dy) {
		int newspeed = dx * 0;
		x = x + newspeed;
		y = y + dy;
	}

}
