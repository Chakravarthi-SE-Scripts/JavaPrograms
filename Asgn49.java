import java.util.Arrays;
import java.util.Scanner;

public class Asgn49 {

	public static void main(String[] args) {
		

	
		System.out.print("Enter name to reverse it and display:-- ");
		Scanner name=new Scanner(System.in);
    	String S1=	name.next();
    	
		
		for (int i=0;i<S1.length();i++)
		{
		System.out.println(S1.charAt(i));
		}
		
		System.out.println("\n");
		
		for(int j=S1.length()-1;j>=0;j--)
    	{
    	
        	System.out.println(S1.charAt(j));
    	}
		
		
		
		
		
		

	
	}

}
