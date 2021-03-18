package Project1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void CountLinks(){
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = links.size();
		for(int i=count-1; i>=0; i--){
			WebElement txt = links.get(i);
			String gtxt = txt.getText();
			System.out.println(gtxt);
		}
		driver.close();
	}

}
