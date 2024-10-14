import java.util.Arrays;

public class Asgn38To44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1="Test MKT";
	String s2="I am from INDIA";
	String s3="TEST 1231";
	String s4="ABCDEF103829237";
	String s5="BALL";
	
	
	String r1=s1.replace("K", "T");
	String r2=s2.replace("INDIA", "USA");
	String r3=s3.replace("2", "");
	String r4=s4.replaceAll("[A-Z]", "");
	String r5=s4.replaceAll("[0-9]", "");
	boolean b1=s5.matches("....");
	System.out.println(r1); // replacing K with T
	System.out.println(r2); // replacing INDIA to USA
	System.out.println(r3); // Replacing 2 with blank
	System.out.println(r4);//replacing all alphabet capital letters to blank
	System.out.println(r5); // replacing all numbers to blank
	System.out.println(b1); // to find exact string count match
	
	
	
		

	
	}

}
