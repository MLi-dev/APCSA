package inheritancedemo;
import java.util.Scanner;


public class BankAccount {
	private String password;
	private double balance;
	private static double intRate;

	public BankAccount(String password, double balance) {
		this.password = password;
		this.balance = balance;

	}
	public double getBalance() {
		return balance;
	}

	public void deposit(String password, double amount) {
		if (!password.equals(this.password)) {
			System.out.println("Invalid");

		} else {

			balance += amount;
			System.out.println(balance);

		}
	}

	public void withdraw(String acctPassword, double amount) {

		if (!acctPassword.equals(password)) {
			System.out.println("Invalid");
		} else {
			balance -= amount;
			System.out.println(balance);
			if (balance<0) {
				System.out.println("Error:Insufficient funds");
			}

		}

	}
	public static double getInterestRate() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter interest rate for bank account");
		System.out.println("Enter in decimal form:");
		double intRate = reader.nextDouble();
		reader.close();
		return intRate;
		
	}

	public static void main(String[] args) {
		BankAccount c = new BankAccount("KevinC", 800);
		BankAccount d = new BankAccount("MatthewL", 1000);
		System.out.println(d.getBalance());
		d.withdraw("MatthewL", 100);
		d.deposit("MatthewL", 600);
		double interestRate = BankAccount.getInterestRate();
		System.out.println("You interest rate is "+ interestRate);
	}

}
