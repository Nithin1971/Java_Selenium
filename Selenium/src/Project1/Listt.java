package Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/select.html");
		Thread.sleep(1500);
		WebElement S1 = driver.findElement(By.id("Gundu palav"));
		Select S=new Select(S1);
		Thread.sleep(2000);
		List<WebElement> option = S.getOptions();
		TreeSet<String> A=new TreeSet<String>();
		for(WebElement o:option)
		{
			String text = o.getText();
			A.add(text);
		}
		
		for(String A1:A)
		{
			System.out.println(A1);
		}
	}
}
