package robot;

public class RaceLane {
	private static String lane;

	static String getLane(int yCoord) {
		switch (yCoord) {
		case (0):
			lane = "Lane 1";
			break;
		case (80):
			lane = "Lane 2";
			break;
		case (160):
			lane = "Lane 3";
			break;
		case (240):
			lane = "Lane 4";
			break;

		}
		return lane;
	}

}
