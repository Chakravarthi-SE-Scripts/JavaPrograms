import java.util.Arrays;

public class Asgn29And30and31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String name[]= new String[3]; //accepting duplicate values
		name[0]="avc";
		name[1]="";
		name[2]="avc";
			

		String name1[]= new String[3]; //updating array values
		name1[0]="avc";
		name1[0]="abc";
		name1[1]="";
		name1[2]="avc";
		
		String rollno[]=new String[2]; //storing null values
		rollno[0]=" ";
		rollno[1]="test";
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name1));
	
	}

}
