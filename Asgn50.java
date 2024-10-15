
import java.util.Arrays;
import java.util.Date;

public class Asgn50 {

	public static void main(String[] args) {
			
		 Date d1=new Date();
		 long l1= d1.getTime(); 
		 System.out.println(l1); 
		 Date d2=new Date(d1.getTime()- (1000*60*60*24*4)); 
		 System.out.println(d2); 
		 String d3= d2.toString();
		 String month=d3.substring(4, 7); 
		 System.out.println(month);
		 String year=d3.substring(d3.length()-4);
		 System.out.println(year);
		 String date=d3.substring(8, 10); 
		 System.out.println(date);
		 String dateformat1= date.concat("-").concat(month).concat("-").concat(year); 
		 System.out.println(dateformat1); 
		 String dateformat2= date.concat("/").concat(month).concat("/").concat(year); 
		 System.out.println(dateformat2);
		 
		 
	 }


	
	}


