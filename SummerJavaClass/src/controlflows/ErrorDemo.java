package controlflows;

import java.util.Scanner;

public class ErrorDemo {
public static void main (String[] args){
	int num, deno;
	Scanner input= new Scanner(System.in);
	try {
		System.out.print("Please enter the numerator:");
		num = input.nextInt();
		System.out.print("Please enter the denominator:");
		deno = input.nextInt();
		
	System.out.print(("The result is " + num/deno));
	
	if (num==0) {
		throw new Exception(" ErrorDemo, cannot take number 0.");

	}
	
	
	}
catch(

	Exception e)
	{
		System.out.println(e.getMessage());
	}finally
	{
		System.out.println("----End of Error Handling Example----");

	}
}}
