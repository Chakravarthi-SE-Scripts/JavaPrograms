


interface mainclsintrfc  //interface
{
	abstract void add();
	
	
}
interface mainclsintrfc2  //interface
{
	
	abstract void sub();
	
}
 class cls1  //abstract class
{
	
	static void addthree() //concrete method
	{
		int a=10,b=20,c=30;
		int d=a=b+c;
		System.out.println(d);
	}
	
	
}

public class Asgn53 extends cls1 implements mainclsintrfc,mainclsintrfc2 {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Interface1");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Interface2");
		
	}
	
	public static void main(String[] args) {
			
	
     Asgn53 as53=new Asgn53();
     as53.add();
     as53.sub();
     as53.addthree();
  
		 
		 
	 }

	
	
	
	}


