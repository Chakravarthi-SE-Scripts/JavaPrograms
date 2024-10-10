import java.util.Arrays;
import java.util.Scanner;

public class Asgn32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollno[]=new int[3]; //checking two arrays equal or not
		rollno[0]=12;
		rollno[1]=23;
		rollno[2]=32;
		
		int clsid[] =new int[3];
		clsid[0]=12;
		clsid[1]=23;
		clsid[2]=32;
		
		boolean b1=Arrays.equals(rollno, clsid);
		if(b1==true)
		{
			System.out.println("Both arrays were equal");
		}
	
		else
		{
			System.out.println("Arrays were not equal");
		}
	
	}

}
