

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asgn84and85 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	WebElement w1=		driver.findElement(By.name("login"));
	Actions a1=new Actions(driver);
	a1.doubleClick(w1).perform(); //doubleclick
	a1.contextClick().perform(); //right click
	

	}

}
