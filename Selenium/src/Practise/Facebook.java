package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com");
		 WebElement ele = d.findElement(By.xpath("//input[@name='email']"));
		 ele.sendKeys("hello");
		 String s=ele.getAttribute("value");
		 System.out.println(s);
		

	}

}
