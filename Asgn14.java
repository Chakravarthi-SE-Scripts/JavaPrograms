
//single level inheritance for static 
class parent {
	
	static void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=10,b=5,c;
		c=a-b;
		System.out.println(c);
	}
}
public class Asgn14 extends parent
{
	static void multply()
	{
		int a=10,b=20,c;
		c=a*b;
		System.out.println(c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   add();
   sub();
   multply();
   
	}

		
		
	}
			
	


