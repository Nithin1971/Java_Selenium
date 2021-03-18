package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample36 {
	public static void main(String[] args  ) {
		
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/select.html");
		WebElement ele = driver.findElement(By.id("Gundu palav"));
		Select s=new Select(ele);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			WebElement we = op.get(i);
			if(i==2){
				System.out.println(we.getText());
				break;
				}
			System.out.println("hi");
		
		}
		
		
	}
}
