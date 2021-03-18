package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assig {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/Assign.html");
		List<WebElement> d1 = driver.findElements (By.id("a1"));
		int S1 = d1.size();
		System.out.println(S1);
		for (WebElement b:d1) {
			b.sendKeys("hello");
			Thread.sleep(1500);
			}
		for (int i = S1-1; i >=0 ; i--) {
			d1.get(i).clear();
			Thread.sleep(1000);
		}
	}
}
