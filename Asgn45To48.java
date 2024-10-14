import java.util.Arrays;

public class Asgn45To48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String s="CHAKRAVARTHI";
		String s2="21 11 2024";
		boolean b1=s.matches("C(.*)");
		boolean b2=s.matches("(.*)I");
		boolean b3=s.matches("(.*)A(.*)");
		String rplce=s2.replace(" ","-");
		System.out.println(b1); // verifying if starting letter is C or not
		System.out.println(b2); //verifying the string is ending with I or not
		System.out.println(b3); //Verify A is present in string or not
		System.out.println(rplce); //Replcaing space with -
		
		
		

	
	}

}
