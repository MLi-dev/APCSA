package objectorientedprogramming;

public class PaymentCalculator {
	private int hourlyRate = 30;
	private int staffPay;
	
	public PaymentCalculator(int pay) {
		staffPay=pay;
	
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public int getStaffPay() {
		return staffPay;
	}

	public void setStaffPay(int staffPay) {
		this.staffPay = staffPay;
	}


	public int calculatePay(int hoursWorked) {
		staffPay = hoursWorked * hourlyRate;
		if (hoursWorked > 0)
			return staffPay;
		else
			return -1;
	}
	
	public int calculatePay(int hoursWorked, int hourlyRate) {
		staffPay = hoursWorked * hourlyRate;
		if (hoursWorked > 0)
			return staffPay;
		else
			return -1;
	}
	
	public static void main(String[] arg) {
		PaymentCalculator pc = new PaymentCalculator(10);
		pc.setHourlyRate(45);
		System.out.println(pc.calculatePay(50));
		System.out.println(pc.getStaffPay());
		System.out.println(pc.calculatePay(30, 20));
	}

}
