package FrstSel;

import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter num to launch browser  1: Firefox  \n 2: Chrome ");
		Scanner s=new Scanner(System.in);
		int input =s.nextInt();
		switch(input)
		{
		case 1:
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println( driver.getWindowHandle());
		driver.close();
		break;
		case 2:
			ChromeDriver driver1=new ChromeDriver();
			driver1.get("https://facebook.com");
			System.out.println(driver1.getCurrentUrl());
			System.out.println(driver1.getTitle());
			driver1.close();
			break;
		default:System.out.println("Enter numbers only 1 or 2");
			break;

	}
	
		s.close();
	
	}
}
