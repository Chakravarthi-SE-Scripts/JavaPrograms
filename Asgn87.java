package FrstSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//img[@id=\"drag9\"]"));
		WebElement w2=driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		WebElement w3=driver.findElement(By.xpath("//div[@id=\"container-8\"]"));
		
		Actions a1=new Actions(driver);
		
		a1.dragAndDrop(w1, w2).perform();
		
		a1.dragAndDrop(w2, w3).perform();
		//a1.contextClick().perform();

	}

}
