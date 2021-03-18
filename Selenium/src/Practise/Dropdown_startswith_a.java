package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_startswith_a {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/Adropdown.html");
		WebElement dd = driver.findElement(By.id("a1"));
		Select s1=new Select(dd);
		List<WebElement> op = s1.getOptions();
		for(WebElement w1:op)
		{
			String txt = w1.getText();
			if(txt.startsWith("a")){
				System.out.println(txt);
			}
		}
	}
	
}
