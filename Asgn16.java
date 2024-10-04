
//multiple level inheritance for static and non static 

class Hero {
	
	 void acting()
	{
		System.out.println("Hero can act");
	}
	static void dance()
	{
		
		System.out.println("Hero can dance");
	}
}

class HeroSon extends Hero{
	void sing()
	{
		System.out.println("Hero son can sing");
		
	}
	static void snap()
	{
		System.out.println("Hero son can click snap");
	
	}
	
	
}
class HeroSon extends Hero{
	void sing()
	{
		System.out.println("Hero son can sing");
		
	}
	static void snap()
	{
		System.out.println("Hero son can click snap");
	
	}
	
	
}class HeroGrandSon extends HeroSon{
	void read()
	{
		System.out.println("Hero grandson can read");
		
	}
	static void write()
	{
		System.out.println("Hero grandson can click write");
	
	}
	
	
}

public class Asgn16 extends HeroGrandSon {
	static void direct()
	{
		System.out.println("hero grandson can direct");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn16 a=new Asgn16();
		a.acting();
		dance();
		snap();
		a.sing();
		direct();
		a.read();
		write();
		
	}

}
