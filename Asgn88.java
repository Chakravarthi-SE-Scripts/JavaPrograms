package FrstSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugstion {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement w4=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w4.sendKeys("Shoe");
		Thread.sleep(7000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int len=l1.size();
		System.out.println("Count of autosuggestion is: "+len);
		Thread.sleep(7000);
		for(int i=0;i<len;i++)
		{
		WebElement w1=	l1.get(i);
		String txt=w1.getText();
		System.out.println(txt);
		}
		WebElement w3=	l1.get(2);
		w3.click();
	}

}
