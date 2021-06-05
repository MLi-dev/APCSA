package standardclasses;

public class BankAccount {
	private int x;

	public BankAccount(int x) {
		this.x = x;
	}

	public String toString() {
		return "Bank Account: balance = $" + x;
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount(600);
		System.out.println(b);
	}

}
