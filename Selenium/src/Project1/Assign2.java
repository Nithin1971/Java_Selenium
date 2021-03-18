package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> tag = driver.findElements(By.tagName("img"));
		int count = tag.size();
		System.out.println(count);
		for (WebElement b : tag) {
			System.out.println(b.getAttribute("src"));
			
		}
	}
}
