package FrstSel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonLinkTxtAsgn {

	public static void main(String[] args)
	{
	 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Customer Service")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
