package Practise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample33 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String patrent_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		driver.manage().window().maximize();
		int count = allwh.size();
		System.out.println(count);
		allwh.remove(patrent_id);
		int count1 = allwh.size();
		for(String wh:allwh){
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}
}
