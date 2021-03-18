package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/assignment1.html");
		Thread.sleep(1500);
		driver.findElement(By.id("a1")).sendKeys("hello");
		Thread.sleep(1500);
		driver.findElement(By.name("n2")).clear();
		Thread.sleep(1500);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.close();
	
	}
}
