import java.util.Scanner;

public class asgn58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to perform below operation \n 1 Add \n 2 Sub \n 3 mul \n 4 Div");
		Scanner s=new Scanner(System.in);
		int input = s.nextInt();
		switch(input)
		{
		case 1:
			System.out.println("Enter two number to add");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a+b;
			System.out.println("Addition of numbers " +a+"," +b+ " is " +c);
			
			break;
			
		case 2:
			System.out.println("Enter two number to subtract");
			int d=s.nextInt();
			int e=s.nextInt();
			int f=d-e;
			System.out.println("Addition of numbers " +d+ "," +e+ " is " +f);
			
			break;
			
		case 3:
			System.out.println("Enter two number to Multiply");
			int g=s.nextInt();
			int h=s.nextInt();
			int i=g*h;
			System.out.println("Addition of numbers " +g+ "," +h+ " is " +i);
			
			break;
			
		case 4:
			System.out.println("Enter two number to divide");
			int l=s.nextInt();
			int m=s.nextInt();
			int n=l/m;
			System.out.println("Addition of numbers " +l+ "," +m+ " is " +n);
			
			break;
				
		default:
           System.out.println( "Invalid input! Please enter a number from above options.");
            break;
		}
		
	}

}
