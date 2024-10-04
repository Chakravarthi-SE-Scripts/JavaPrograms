
//Single level inheritance for non static 
class Prntcls {
	
	 void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	 void sub()
	{
		int a=10,b=5,c;
		c=a-b;
		System.out.println(c);
	}
}


public class Asgn15 extends Prntcls {
	void div()
	{
		int a=10,b=2,c;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn15 a=new Asgn15();
		a.add();
		a.sub();
		a.div();
		
	}

}
