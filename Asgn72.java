import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Asgn72 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> mp=new HashMap();
		mp.put("std1", 10);
		mp.put("std2", 13);
		mp.put("std3", 24);
		System.out.println(mp); //printing 
		
				
		if(mp.containsKey("std2"))
		{
				System.out.println( mp.get("std1"));
		}
		else
		{
			System.out.println("Not available");
		}
	}

}
