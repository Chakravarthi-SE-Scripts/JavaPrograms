import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Asgn71 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> mp=new HashMap();
		mp.put("apple", 10);
		mp.put("Oranges", 13);
		mp.put("Banana", 24);
		System.out.println(mp); //printing 
		System.out.println(mp.get("apple"));
		
		mp.remove("Banana");
		System.out.println(mp);
		
		for(Integer m1:mp.values())
		{
			System.out.println(m1);
		}
		
		if(mp.containsValue("Grape"))
		{
			System.out.println("Not Available");
			
		}
		else
		{
			System.out.println("Not avaialble");
		}
		
	}

}
