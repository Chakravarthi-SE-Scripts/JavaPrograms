import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class asgn60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1); 
		c.add(-1); 
		c.add("TEST");
		Collection c2=new ArrayList();
		c2.add(34);
		c2.addAll(c);
		System.out.println(c2.isEmpty());
		System.out.println(c2);
		
		
		
		}
		
	}


