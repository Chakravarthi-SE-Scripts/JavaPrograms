
//program on this calling statement

//this calling is used to call from one constructor to other constructor

class mainClass {
	
	  mainClass()
	{
		this(100);  // using this calling statement we were calling next constructor with int parameters
		System.out.println("this is main class 1");
	}
	 mainClass(int a)
	{
		this("ab"); // using this calling satement we were calling next constructor with string parameters
		System.out.println("this is prameterised constructer overloading 2");
	}
	 mainClass(String S)
	 {
		 
		 System.out.println("This is parameterised constructed 3");
	 }
}


public class Asgn19 extends Prntcls {
	
	public static void main(String[] args) 
	{
		// as we are using this calling statement so no need to call the constructor with parameters in this program, we need to call non oarameterised constructor

		new mainClass(); 
	}

}
