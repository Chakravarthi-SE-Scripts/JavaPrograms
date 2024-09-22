import java.util.Scanner;

public class Asgn5 {

	static void CircleArea()
	{
		double pi=3.24;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius value:- ");
		double r=s1.nextDouble();
		double area=pi*r*r;
		System.out.println("Area of Circle is "+area);
	}
	public static void main(String[] args) {
		CircleArea();
	}

}
