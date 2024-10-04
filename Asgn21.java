
//Single level inheritance for non static 
class Prntclses {
	
	 void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
}


public class Asgn21 extends Prntclses {
	void add()
	{
		super.add();//using super keyword we are displaying add method 
		//super.sub();
		int a=10,b=2,c;
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn21 a=new Asgn21();
		a.add();
				
	}

}
