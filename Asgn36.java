import java.util.Arrays;

public class Asgn36 {

	static int alpbtcount;
	static int spcecount;
	static int numcount;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String input="AP (@  TESTING 13413";
		char c[]=input.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<input.length();i++)
		{
			boolean b1=Character.isAlphabetic(c[i]);
			if(b1==true)
			{
				alpbtcount++;
			}
			boolean b2=Character.isDigit(c[i]);
			if(b2==true)
			{
				numcount++;
			}
			boolean b3=Character.isWhitespace(c[i]);
			if(b3==true)
			{
				spcecount++;
				
			}
			
			
			
		}
		int spclcount=input.length()-(alpbtcount+numcount+spcecount);
		System.out.println("The alphabet count is " +alpbtcount+ " The number count is " +numcount+ " The space count is "+spcecount+ " Special character count is  "+spclcount);

	
	}

}
