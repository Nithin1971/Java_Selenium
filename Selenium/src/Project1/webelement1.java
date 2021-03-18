package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/Keys.html");
		WebElement ele= driver.findElement(By.xpath("//input[@id='A1']"));
		WebElement ele1=driver.findElement(By.xpath("//input[@id='A2']"));
		ele.sendKeys(Keys.CONTROL+"AX");
		ele1.sendKeys(Keys.CONTROL+"AV");
		
	}
}
