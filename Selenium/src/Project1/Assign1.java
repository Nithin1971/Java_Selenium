package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> a = driver.findElements(By.tagName("a"));
		int count=a.size();
		System.out.println(count);
		/*for(WebElement b:a)
		{
			System.out.println(b.getAttribute("href"));
		}*/
		for (int i = 0; i <count; i++) {
			System.out.println((i+1)+"	"+a.get(i).getAttribute("href"));
		}
	}
}
