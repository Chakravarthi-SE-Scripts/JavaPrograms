import java.util.Arrays;

public class Asgn34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int rollno[]=new int[3]; //storing null values
		rollno[0]=12;
		rollno[1]=23;
		rollno[2]=32;
		
		int rollnoCheck=32;
		for(int i=0;i<rollno.length;i++)
		{
			if(rollnoCheck==rollno[i])
			{
				System.out.println("Number is available in array elements at index position " +i);
			
			}
			
			
		}
		

	
	}

}
