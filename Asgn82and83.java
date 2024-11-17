

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asgn82and83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		WebElement w2=driver.findElement(By.xpath("(//object/a)[4]"));
		a1.moveToElement(w2).perform();
		driver.findElement(By.xpath("(//object/a)[13]")).click();
		System.out.println(driver.getTitle());
		

	}

}
