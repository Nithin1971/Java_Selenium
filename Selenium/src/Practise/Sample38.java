package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample38 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/Frames.html");
		WebElement ele = driver.findElement(By.id("t1"));
		ele.sendKeys("hello");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("baa guru");
		driver.switchTo().defaultContent();
		}
}
