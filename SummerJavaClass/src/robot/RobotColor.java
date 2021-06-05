package robot;

import java.awt.Color;

public class RobotColor {
	private static Color color;

	public RobotColor() {
		color = Color.WHITE;
	}

	static Color getColor(String col) {
		switch (col.toLowerCase()) {
		case "fast":
			color = Color.RED;
			break;
		case "slow":
			color = Color.BLUE;
			break;
		case "normal":
			color = Color.GREEN;
			break;
		case "stuck":
			color = Color.BLACK;
			break;
		}
		return color;
	}
}
