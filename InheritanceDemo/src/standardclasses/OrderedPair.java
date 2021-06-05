package standardclasses;

public class OrderedPair {
	private double x;
	private double y;


	public OrderedPair(double x, double y) {
		this.x=x;
		this.y=y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

public static void main (String[] args) {
	OrderedPair p = new OrderedPair(7.0,10.0);
	System.out.println(p);
}
}
