import java.util.Scanner;

public class Asgn12 {

	 void CircleArea()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius value:- ");
		int r=s.nextInt();
		double area=Math.PI*r*r;
		System.out.println("Area of Circle is "+area);
	}
	public static void main(String[] args) {
		Asgn12 CA=new Asgn12();
		CA.CircleArea();
	}

}
