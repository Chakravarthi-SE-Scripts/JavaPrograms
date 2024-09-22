
public class Asgn2 {

	
	 void addition()
	{
		int a=10,b=20;
		int add=a+b;
		System.out.println("Addition is "+add);
	}
	 void subtraction()
	{
		int a,b;
		a=100;
		b=20;
		int sub=a-b;
		System.out.println("Subtraction is "+sub);
	}
	 void Multiplication()
	{
		int a,b;
		a=10;
		b=20;
		int multiply=a*b;
		System.out.println("Multiplication is " +multiply);
	}
	 void division()
	{
		int a,b;
		a=100;
		b=20;
		int div=a/b;
		System.out.println("Division is "+div);
	}
	 void remainder()
	{
		int a,b;
		a=100;
		b=20;
		int rem=a%b;
		System.out.println("Remainder is "+rem);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asgn2 a2=new Asgn2();
		a2.addition();
		a2.Multiplication();
		a2.division();
		a2.subtraction();
		a2.remainder();
	}

}
