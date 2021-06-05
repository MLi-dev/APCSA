package standardclasses;

public class CompareStrings {

	public static void main(String[] args) {
		String s = "oh no!";
		String t = "oh no!";
		String p = new String ("oh no!");
//Java makes only one String object for equivalent string literals
		System.out.println(s == t);
		//returns false because s and p have different reference addresses
		System.out.println(s==p);  
//For .equals, Java looks at string content. s and p both create a new string "oh no".
		System.out.println(s.equals(t));
		System.out.println(s.equals(p));
		System.out.println(p.length());
//0,1 indicates where to start and where to end for the string.
//Note that only "o" is printed, b/c string index does not include endpoint.
		System.out.println(p.substring(0,1));
//Indicates which point does str start. 
		System.out.println(p.indexOf("no"));

	}
}
