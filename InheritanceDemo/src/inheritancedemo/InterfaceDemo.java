package inheritancedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.someMethod();
		System.out.println("The value of the constant is" + MyInterface.myInt);

	}

}
