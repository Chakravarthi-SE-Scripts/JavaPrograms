import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class asgn67and68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SET 
		Set s=new HashSet();
		s.add(23);
		s.add(66);
		s.add(1);
				
	
		System.out.println("SET " +s);
		
		//Sorting using Collections class
		
		List l1=new ArrayList();
		l1.add(23);
		l1.add(43);
		l1.add(1);
		
		System.out.println("List Before sorting " +l1);
		
		Collections.sort(l1);
		
		System.out.println(" List After sorting " +l1);
		
		
		}
		
	}


