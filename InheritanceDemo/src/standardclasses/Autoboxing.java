package standardclasses;

import java.util.ArrayList;

public class Autoboxing {
public String stringMethod(Double d) {
	return d.toString();
	
}
	
public static void main (String[] args) {
	Integer intOb = 3;
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(4); 
	list.add(5);
	System.out.println(list);
	double realNum = 4.5;
	Autoboxing a = new Autoboxing();
	String str = a.stringMethod(realNum);
	System.out.println(str);
}

}

