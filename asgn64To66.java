import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class asgn64To66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1=new ArrayList(); //Upcasting
		l1.add(23);
		l1.add(43);
		
		Iterator lt1= l1.iterator();  //Iterator
		
		while(lt1.hasNext())
		{
			System.out.println(lt1.next());
		}
		
		List l2=new ArrayList();
		l2.add(28);
		l2.add("TEST");
		
		ListIterator lt2= l2.listIterator(); //Listiterator
		
		while(lt2.hasNext())
		{
			System.out.println(lt2.next());
		}
		
		
		}
		
	}


