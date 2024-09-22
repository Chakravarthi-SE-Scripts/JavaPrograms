import java.util.Scanner;

public class Asgn8 {
	
	static void SquareArea()
	{
		int s,side;
		System.out.println("Enter side of square: ");
		Scanner s1=new Scanner(System.in);
		s=s1.nextInt();
		side=s*s;
		System.out.println("Area of square is: "+side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SquareArea();
		
	}

}
