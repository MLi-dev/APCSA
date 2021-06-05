package standardclasses;

//Date is the class name
public class Date {
//month, day, year, and age are Fields, class-variables. 
	private int month;
	private int day;
	private int year;

	public Date() {
//Constructors by default have no set parameters
//Even when not explicitly defined, Java has default constructor for class.
	}

//Constructor with parameters. 
	public Date(int year, int month, int day) {

//Passes in parameters, set to class-variables month, day, and year. 
		this.month = month;
		this.day = day;
		this.year = year;
	}

//Method that returns year, month and day as a string.
	public String getBirthday() {
		return year + "/" + month + "/" + day;

	}

//Main runs code. 
	public static void main(String[] args) {

//Object, is an instance of Date class.
		Date david = new Date(1999, 12, 8);
		System.out.println(david.getBirthday());
	}
}
