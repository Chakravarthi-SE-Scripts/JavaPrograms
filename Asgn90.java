package FrstSel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@name='google-register']")).click();
		System.out.println(driver.getWindowHandles());
		Set<String> id=driver.getWindowHandles();
		Iterator<String> i1=id.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("ChildWindow");
		
		

	}

}
