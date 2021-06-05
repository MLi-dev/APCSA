package frq2019;

public class APCalendar {

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		}
		return false;
	}

	public static int numLeapYears(int year1, int year2) {
		int count = 0;
		for (int i = year1; i < year2; i++) {
			if (isLeapYear(i)) {
				count++;
			}
		}
		return count;
	}

	private static int firstDayOfYear(int year) {
		int start = 0;
		int start2 = 0;
		int start3 = 0;
		start = 5 * ((year - 1) % 4);
		start2 = 4 * ((year - 1) % 100);
		start3 = 6 * ((year - 1) % 400);
		return (1 + start + start2 + start3) % 7;
	}

	private static int dayOfYear(int month, int day, int year) {
		int count = 0;
		if (month > 1) {
			count = month * 30 + day;
		} else {
			count = day;
		}
		return count;
	}

	public static int dayOfWeek(int month, int day, int year) {
		int day1 = firstDayOfYear(year);
		int doy = dayOfYear(month, day, year);
		return ((day1 + doy - 1) % 7);
	}

	public static void main(String[] args) {
		// I would only expect 1 leap year, due to them being every 4 years.
		System.out.println(numLeapYears(2008, 2012));

		// Expecting 2 leap years.
		System.out.println(numLeapYears(1998, 2008));

		// I expect 2, representing Tuesday.
		System.out.println(dayOfWeek(1, 1, 2019));

		// Expecting 4.
		System.out.println(dayOfWeek(1, 17, 2019));

	}

}
