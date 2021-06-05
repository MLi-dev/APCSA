package iteration;

public class Iteration {
	public static void main(String[] args) {
		int iters = 3;
		int count = 0;
		int ifcount = 0;
		while (count < iters) {
			System.out.println("Count is " + count);
			count++;
		}
		System.out.println("It took " + count + " tries to break the loop");
		
		for (ifcount =0; ifcount<iters; ifcount++) {
			System.out.println("ifcount is.. " + ifcount);
		}
		
		int[] cnumbers = {1, 2, 3, 4};
		for(int e: cnumbers) {
			System.out.println("An element of cnumbers is " +e);
		}
	}
	
	

}
