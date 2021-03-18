package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSE {

	@Test
	public void annot(){
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		 WebElement ele = driver.findElement(By.xpath("//span[text()='United States']"));
		 Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.scrollBy(" +x+ "," +y+ ")","ele");
		//ele.click();
		
		
		
	}
}
