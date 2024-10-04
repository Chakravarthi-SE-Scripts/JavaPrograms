
//program on abstract class with concrete class
abstract class Prntclas {
	
	abstract void abs1();
	abstract void abs2();
	
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
}


public class Asgn22 extends Prntclas {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn22 a=new Asgn22();
		a.add();
		a.abs1();
		
		
		
	}

	@Override
	void abs1() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract class");
		
	}

	@Override
	void abs2() {
		// TODO Auto-generated method stub
		
	}

	

	

}
