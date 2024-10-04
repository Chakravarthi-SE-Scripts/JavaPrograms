
//multiple level inheritance using interface
interface parent1 // using interface we were acheiving multiple inheritance(2 parents interfaces having 1 child class
{
	
	void method1();
	void method2();
}

interface parent2
{
	void method3();
	void method4();
}

public class Asgn24 implements parent1,parent2 { // implements keyword is used for inherting multiple parents interface to child class
	
	public void method3()
	{
		System.out.println("this is method 3");
	}

	public void method4()
	{
	    System.out.println("This is method 4");
	}
	public void method1()
	{
	    System.out.println("This is method 1");
	}
	public void method2() 
	{
     	System.out.println("This is method 2");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn24 a=new Asgn24();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
	}

	
	

}
