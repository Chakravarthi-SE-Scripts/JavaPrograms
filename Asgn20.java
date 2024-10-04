
//method overriding 
class Prntclss {
	
	 void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
}


public class Asgn20 extends Prntclss {
	void add()
	{
		int a=10,b=2,c;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn20 a=new Asgn20();
		a.add(); // add method is getting overridden and displaying only under class Asgn20
		
		
	}

}
