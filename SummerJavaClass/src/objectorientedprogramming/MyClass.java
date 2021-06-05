package objectorientedprogramming;


public class MyClass {

	public void passPrimitive(int primitivePara) {
		primitivePara = 10;
		System.out.println("Value inside method=" + primitivePara);
	}

	public void passReference(int[] refPara) {
		refPara[1] = 5;
		System.out.println("Value inside method=" + refPara[1]);
	}

	public static void main(String[] args) {
		int num=2;
		System.out.println("Number before = "+num);
		MyClass amd = new MyClass();
		amd.passPrimitive(num);
		System.out.println("Number after = "+num);
		int[] myArray = {1,2,3,4,5};
		System.out.println("myArray[1] before ="+myArray[1]);
		amd.passReference(myArray);
		System.out.println("myArray[1] after  ="+ myArray[1]);

	}

}
