
import java.util.Arrays;

interface supermstClass  //interface
{
	abstract void add();
	abstract void sub();
	
}
abstract class abstrctcls implements supermstClass //abstract class
{
	abstract void div(); //Abstract method
	abstract void mul();
	static void addthree() //concrete method
	{
		int a=10,b=20,c=30;
		int d=a=b+c;
		System.out.println(d);
	}
	
	static void addfour()
	{
		int a=130,b=20,c=30,e=55;
		int d=a=b+c+e;
		System.out.println(d);
	}
}

public class Asgn51 extends abstrctcls{

	void multhree() //concrete method
	{
		int l=2,m=3,n=5;
		int o=l*m*n;
		System.out.println(o);
	}
	void divthree()
	{
		int x=2,y=4,z=2;
		int div=(x/y)/z;
		System.out.println(div);
	}
	public static void main(String[] args) {
			
	
  Asgn51 asg=new Asgn51();
  asg.add();
  asg.div();
  asg.divthree();
  asg.multhree();
  asg.addfour();
  asg.addthree();
  asg.mul();
		asg.sub();
		 
		 
	 }
	@Override
	public void add() {
	
		System.out.println("It is add for interface");
	}
	@Override
	public void sub() {
	
		System.out.println("It is sub for interface");
	}
	@Override
	void div() {
	
		System.out.println("It is abstract class div");
		
	}
	@Override
	void mul() {
		System.out.println("It is abstract class mul");
		
	}


	
	}


