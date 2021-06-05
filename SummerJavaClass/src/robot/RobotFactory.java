package robot;

import java.awt.Color;

public class RobotFactory {
	public SuperRobot getRobot(String modelType) {
		if (modelType == null) {
			return null;
		}
		if (modelType.equalsIgnoreCase("FAST")) {
			return new FastRobot(RobotColor.getColor(modelType));
		} else if (modelType.equalsIgnoreCase("SLOW")) {
			return new SlowRobot(RobotColor.getColor(modelType));
		} else if (modelType.equalsIgnoreCase("NORMAL")) {
			return new NormalRobot(RobotColor.getColor(modelType));
		} else if (modelType.equalsIgnoreCase("STUCK")) {
			return new StuckRobot(RobotColor.getColor(modelType));
		}
		return null;
	}
}
