package FrstSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abslteXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swath/Documents/grotechminds.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/input[1]")).sendKeys("Test");
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("Test2");
		driver.findElement(By.xpath("html/body/input[3]")).sendKeys("password");
		driver.findElement(By.xpath("(html/body/form/input)[1]")).sendKeys("FirstNme");
		driver.findElement(By.xpath("(html/body/form/input[1])[2]")).click();
		driver.findElement(By.xpath("(html/body/form/input[2])[2]")).click();
		driver.findElement(By.xpath("(html/body/form/input[3])[2]")).click();
		driver.findElement(By.xpath("(html/body/input)[4]")).click();
		driver.findElement(By.xpath("(html/body/input)[6]")).click();
		WebElement w1=driver.findElement(By.xpath("html/body/select"));
		Select s1= new Select(w1);
		s1.selectByIndex(1);
		WebElement w2=driver.findElement(By.xpath("(html/body/form/input[2])[1]"));
		System.out.println(w2.isDisplayed());
		System.out.println(w2.isEnabled());
		
		if(w2.isEnabled())
		{
		driver.findElement(By.xpath("html/body/input[7]"));
		}
		else
		{
		driver.close();
		}

	}

}
