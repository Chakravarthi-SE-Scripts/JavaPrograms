
//WAP on non parametrized super calling statement (within multiple class)

class Grandprnt1 {
	
	  Grandprnt1()
	{
		 // super();
		System.out.println("this is grandparent");
	}
	
}
class parnt1 extends Grandprnt1{
	parnt1()
	{
		super(); // here it is invoking the non parameterised constructor using super class
		//super class is used implicitly for non parametrised constructors
		 
		System.out.println("This is parent");
	}
}

public class Asgn17 extends parnt1 {
	Asgn17()
	{
		super();
		System.out.println("This is child");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		new Asgn17();
		
	}

}
