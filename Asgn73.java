import java.util.*;
public class Asgn73 {

	public static void main(String[] args) throws InputMismatchException,ArithmeticException{
		// TODO Auto-generated method stub
	try {
		System.out.println("enter size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a=1/0;
		System.out.println(a);
		
		}
	catch(ArithmeticException ae)
	{
		System.out.println("1/0 is infinte and not feasible in arithmetic operations");
	}
	catch(InputMismatchException im)
	{
		System.out.println("Enter input in numbers only");
	}
	
	}
}
