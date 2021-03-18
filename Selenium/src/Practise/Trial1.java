package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement tit = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String title = tit.getAttribute("title");
		System.out.println(title);
		if(title.contains("Kann")){
			System.out.println("pass");
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			int s = links.size();
			System.out.println(s);
			for(int i=0; i<s; i++){
				WebElement g = links.get(i);
				String txt = g.getText();
				System.out.println(txt);
			}
		}
	}
}
