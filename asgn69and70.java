import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.Iterator;

public class asgn69and70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MAP
		Map m1=new HashMap();
		
		m1.put("User1", "har");
		m1.put("User2", "krisna");
		m1.put("User3", "raju");
		
		System.out.println(m1);
		Iterator<Entry<String,String>> it1= m1.entrySet().iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
				
		Map<String,String> m2=new TreeMap();
		
		m2.put("User5", "abhi");
		m2.put("User6", "kris");
		m2.put("User7", "raja");
		
		System.out.println(m2);
		
		
		for(String value:m2.values()) //foreach loop
		{
			System.out.println(value);
		}
		
		}
		
	}


