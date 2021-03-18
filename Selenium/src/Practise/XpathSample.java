package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSample {

	@Test
	public void maps(){
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/dir///@12.9311737,77.5504773,15z");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='searchbox ']/div[1]/div[1]/input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("mysore");
		
	}
}
