
//Single level inheritance for non static 
class superMost {
	
	void abc()
	{
		System.out.println("this is Concrete method 1");
	}
	void edf()
	{
		System.out.println("this is Concrete method 2");
	}
}

abstract class ABClss extends superMost{
	abstract void abmethd1();
	abstract void abmethd2();
	void xyz()
	{
		System.out.println("this is concrete method under abstract class1");
		
	}
	void xyp()
	{
		System.out.println("this is concrete method under abstract class2");
		
	}
}


public class Asgn23 extends ABClss {
	void div()
	{
		System.out.println("this is concrte methd under main class");
	}
	void sub()
	{
		System.out.println("this is concrt methd 2 under main class");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn23 a=new Asgn23();
		a.abc();
		a.edf();
		a.div();
		a.sub();
		a.xyz();
		a.xyp();
		a.abmethd1();
		a.abmethd2();
		
	}
	@Override
	void abmethd1() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract method under abstrt clss 1");
		
		
	}
	@Override
	void abmethd2() {
		// TODO Auto-generated method stub
		System.out.println("this is abstract method under abstrt clss 1");
		
	}

}
