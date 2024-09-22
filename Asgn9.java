import java.util.Scanner;

public class Asgn9 {

	static void AreaRectangle()
	{
		int l,w,a;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		l=s1.nextInt();
		System.out.println("Enter width of rectangle: ");
		w=s1.nextInt();
		a=l*w;
		System.out.println("Area of Rectangle is: "+a);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaRectangle();
	}

}
