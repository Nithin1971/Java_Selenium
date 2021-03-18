package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/checkbox-1.html");
		List<WebElement> chek = driver.findElements(By.tagName("input"));
		int s = chek.size();
		System.out.println(s);
		for(int i=0; i<s; i++){
			WebElement g = chek.get(i);
			g.click();
			Thread.sleep(1000);			
		}
		for(int j=s-1; j>=0;j--){
			WebElement un = chek.get(j);
			un.click();
			Thread.sleep(1000);
		}
		
		
	}
}
