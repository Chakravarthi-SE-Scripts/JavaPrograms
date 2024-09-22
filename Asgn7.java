import java.util.Scanner;

public class Asgn7 {

	void AreaTrngle()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of traingle:- ");
		int l=s1.nextInt();
		System.out.println("Enter breadth of traingle:- ");
		int b=s1.nextInt();
		int area=(l*b)/2;
		System.out.println("Area of Traiangle is "+area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asgn7 at=new Asgn7();
		at.AreaTrngle();
	
		
	}

}
