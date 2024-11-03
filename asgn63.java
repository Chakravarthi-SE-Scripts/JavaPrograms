import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class asgn63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1=new ArrayList();
		l1.add(23);
		l1.add(43);
		
		ListIterator lt1= l1.listIterator();
		
		while(lt1.hasPrevious())
		{
			System.out.println(lt1.next());
		}
		
		
		
		}
		
	}


