
//revrese a string from user input
import java.util.Scanner;

public class Asgn25And26 {
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub



//String a="Testing";	
	//System.out.println(a.substring(2));
	//System.out.println(a.substring(3, 5));
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a text to reverse a string and check it is palindrome or not");
	String input=s.next();
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1=input.charAt(i);
		 output=output+c1;
	}
	if(input.equals(output))
	{
		System.out.println(output+" is palindrome");
	}
		else
		{
			System.out.println("It is not palindrome and this is the string reverse output "+output);
	}
	
	}

	
	

}
