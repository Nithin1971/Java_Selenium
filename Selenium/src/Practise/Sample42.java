package Practise;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sample42 extends Generic {

	@Test
	public void demo() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Samsung");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
	}
}
