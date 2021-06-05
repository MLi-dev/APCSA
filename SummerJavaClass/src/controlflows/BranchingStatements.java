package controlflows;

public class BranchingStatements {
public static void main(String[] arg) {
for (int i=0; i<5; i++) 
{
 System.out.println(" i= " + i);
	if(i == 2)
		continue;
	System.out.println( "I will not be printed where i=2 ");
	
}
}
}

