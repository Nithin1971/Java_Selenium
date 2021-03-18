package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/webelement.html");
		WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
		boolean b= ele.isDisplayed();
		if(b)
		{
			System.out.println("tbox is displayed");
		}
		else
		{
			System.out.println("tbox is not displayed");
		}
		
	}
}
