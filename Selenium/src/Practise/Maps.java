package Practise;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9989714,77.5504773,15z");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();
		Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[5]")).sendKeys("mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='searchbox-searchbutton' and @data-tooltip='Search'])[2]")).click();
		Thread.sleep(5000);
		driver.close();
		 
	}
}
