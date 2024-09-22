
public class Asgn3and4 {
	
	static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void addition(double d, double e)
	{
		double f=d*e;
		System.out.println(f);
		
	}

	//Non Static Method
	void addition(int a, String s,char e)
	{
		System.out.println(a);
		System.out.println("Name is"+s);
		System.out.println(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(10,10);
		addition(1.64,2.75);
		Asgn3and4 a1=new Asgn3and4();
		a1.addition(20,"Text",'A');
	}

}
