package Practise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample34 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh){
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("HSBC")){
				Thread.sleep(2000);
				driver.close();
			}
		}
		
	}
}
