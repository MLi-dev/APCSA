package truthassignment;

public class TruthAssignment {
	private String[] strArray;
	private boolean[] truthArray;
	private String comparison = "Hi";

	public TruthAssignment(String[] array, boolean[] truth) {
		strArray = array;
		truthArray = truth;
	}

	public void assignTruthValue() {
		int i = 0;
		for (String str : strArray) {
			if (str.length() > comparison.length()) {
				truthArray[i] = true;

			}
			i++;
		}

	}
	public String toString() {
		String returnStr="";
		for(boolean k:truthArray) {
			returnStr = returnStr + k + ",";
		}
		return returnStr;
	}
	public static void main(String[] args) {
		String[] a1 = { "Matt", "K", "L", "F", "William" };
		boolean[] a2 = new boolean[a1.length];
		TruthAssignment x = new TruthAssignment(a1, a2); 
		x.assignTruthValue();
		System.out.println(x);
		
	}

}