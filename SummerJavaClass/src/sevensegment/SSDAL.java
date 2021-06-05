package sevensegment;

import java.util.ArrayList;

public class SSDAL {

	private ArrayList<String> createBase8() {
		ArrayList<String> segment = new ArrayList<String>();
		segment.add(" -- ");
		segment.add("|  ");
		segment.add("|");
		segment.add(" --");
		segment.add("|  ");
		segment.add("|");
		segment.add(" -- ");
		return segment;

	}

	public void printNumber(ArrayList<String> segmentList) {
		for (int i = 0; i < segmentList.size(); i++) {
			if (i == 1 || i == 4) {
				System.out.print(segmentList.get(i));
			} else {
				System.out.println(segmentList.get(i));
			}
		}

	}

	public ArrayList<String> createSegment(int number) {
		ArrayList<String> resultList = createBase8();
		switch (number) {
		case 0:
			resultList.set(3, "");
			break;
		case 1:
			resultList.set(0, "");
			resultList.set(1, "");
			resultList.set(3, "");
			resultList.set(4, "");
			resultList.set(6, "");
			break;
		case 2:
			resultList.set(1, "   ");
			resultList.set(5, "");
			break;
		case 3:
			resultList.set(1, "   ");
			resultList.set(4, "   ");
			break;
		case 4:
			resultList.set(0,"");
			resultList.set(4, "   ");
			resultList.set(6, "");
			break;
		case 5:
			resultList.set(2, "");
			resultList.set(4, "   ");
			break;
		case 6:
			resultList.set(2, "");
			break;
		case 7:
			resultList.set(1, "   ");
			resultList.set(3, "");
			resultList.set(4, "   ");
			resultList.set(6, "");
			break;
		case 9:
			resultList.set(4, "   ");
			resultList.set(6, "");
			break;
		default:
			break;

		}

		return resultList;
	}

	public ArrayList<String> createLetter(String letter) {
		ArrayList<String> letterList = createBase8();
		switch (letter) {
		case "A":
			letterList.set(6, "");
			break;
		case "B":
			letterList.set(0, "");
			letterList.set(2, "");
			break;
		case "C":
			letterList.set(2, "");
			letterList.set(3, "");
			letterList.set(5, "");
			break;
		case "D":
			letterList.set(0, "");
			letterList.set(1, "   ");
			break;
		case "E":
			letterList.set(2, "   ");
			letterList.set(5, "");
			break;
		case "F":
			letterList.set(2, "  ");
			letterList.set(5, "");
			letterList.set(6, "");
			break;
		case "H":
			letterList.set(0, "   ");
			letterList.set(6, "");
			break;
		case "I":
			letterList.set(0, "   ");
			letterList.set(2, "");
			letterList.set(3, "");
			letterList.set(4, "");
			letterList.set(6, "");
			break;
		case "J":
			letterList.set(0, "");
			letterList.set(1, "    ");
			letterList.set(3, "");
			letterList.set(4, "    ");
			break;
		case "L":
			letterList.set(0, "");
			letterList.set(1, "");
			letterList.set(3, "");
			letterList.set(4, "");
			break;
		case "N":
			letterList.set(0, "");
			letterList.set(1, "");
			letterList.set(2, "");
			letterList.set(6, "");
			break;
		case "O":
			letterList.set(0, "");
			letterList.set(1, "");
			letterList.set(2, "");
			break;
		case "P":
			letterList.set(5, "");
			letterList.set(6, "");
			break;
		case "R":
			letterList.set(4, "   ");
			letterList.set(6, "");
			break;
		case "S":
			letterList.set(2, "");
			letterList.set(4, "   ");
			break;
		case "U":
			letterList.set(0, "");
			letterList.set(3, "");
			break;
		case "Y":
			letterList.set(0, "");
			letterList.set(4, "   ");
			break;
		case "Z":
			letterList.set(1, "   ");
			letterList.set(5, "");
			break;

		default:
			break;

		}
		return letterList;
	}

	public static void main(String[] args) {
		SSDAL s = new SSDAL();
		s.printNumber(s.createSegment(9));
		s.printNumber(s.createSegment(8));
		s.printNumber(s.createSegment(7));
		s.printNumber(s.createSegment(6));
		s.printNumber(s.createSegment(5));
		s.printNumber(s.createSegment(4));
		s.printNumber(s.createSegment(3));
		s.printNumber(s.createSegment(2));
		s.printNumber(s.createSegment(1));
		s.printNumber(s.createSegment(0));
		s.printNumber(s.createLetter("A"));
		s.printNumber(s.createLetter("Z"));

	}

}
