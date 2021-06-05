package robot;

import java.awt.Color;

public class NormalRobot extends SuperRobot {

	public NormalRobot(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

}
