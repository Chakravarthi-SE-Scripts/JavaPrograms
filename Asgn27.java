import java.util.Arrays;

public class Asgn27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int rollno[]=new int[2]; // array outofbound exveption
		rollno[0]=-1;
		rollno[1]=2;
		rollno[3]=1;
		System.out.println(Arrays.toString(rollno));
		
	
	}

}
