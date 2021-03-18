package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nbsp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yahoo.com/signup.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
