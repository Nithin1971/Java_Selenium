package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/hotel.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		Select s=new Select(ele);
		
		if (s.isMultiple()) {
			System.out.println("howdhu");
		} else {
			System.out.println("illa");
		}
	}
}
