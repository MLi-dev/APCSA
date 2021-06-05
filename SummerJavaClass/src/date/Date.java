package date;

public class Date {
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American format:");
		System.out.println(day + ", " +month + " "+ date+ ", "+year);
	}
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European format:");
		System.out.println(day + " " +date + " "+ month+ ", "+year);
	}
	public static void main(String[] args) {
		String day, month;
		int date, year;
		day = "Saturday";
		date = 9;
		month = "January";
		year = 2021;
		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);
		
		
		
	}
}
