
import java.util.Arrays;
import java.util.Scanner;

public class Asgn33 {//Taking input from user for arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter size of array ");
	int size=sc.nextInt();
	int ary[]=new int[size];
	System.out.println("Enter the array elements with size of "+size);
	for(int i=0;i<size;i++)
	{
		ary[i]=sc.nextInt();
	}
	
	System.out.println("Array elements are "+Arrays.toString(ary));
	
	}

}
