
//WAP on non parametrized super calling statement (within multiple class)

class Grandprnt {
	
	  Grandprnt(String a)
	{
		 // super();
		System.out.println("this is grandparent");
	}
	
}
class parnt extends Grandprnt{
	parnt(int a, int b)
	{
		super("test"); // here it is invoking the parameterised constructor using super class
		 
		System.out.println("This is parent");
	}
}

public class Asgn18 extends parnt {
	Asgn18()
	{
		super(1,2);
		System.out.println("This is child");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		new Asgn18();
		
	}

}
