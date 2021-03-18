package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trial3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/hotel.html");
		WebElement list = driver.findElement(By.id("hotel"));
		Select s=new Select(list);
		 List<WebElement> option = s.getOptions();
		 int count = option.size();
		 for(int i=0; i<count; i++){
			WebElement w = option.get(i);
			String txt = w.getText();
			if(txt.contains("chilli")){
				System.out.println("option present");
			}
		 }
	}
}
