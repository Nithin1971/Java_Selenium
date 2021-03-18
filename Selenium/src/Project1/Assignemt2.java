package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignemt2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/Assignment2.html");
		Thread.sleep(1500);		
		driver.findElement(By.id("a2")).sendKeys("hello");
		Thread.sleep(1500);
		driver.findElement(By.name("n2")).clear();
		Thread.sleep(1500);
		driver.findElement(By.className("c1")).sendKeys("Super");
		Thread.sleep(1500);
		driver.close();
		
	}
}
