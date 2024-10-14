import java.util.Arrays;
import java.util.Scanner;

public class Asgn35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String s1="CAR";
		String s2="AEC";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("Strings were anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		

	
	}

}
