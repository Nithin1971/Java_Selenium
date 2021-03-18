package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class X_path1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//select[@aria-label='Month']")).click();
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement ele:months){
			String txt = ele.getText();
			System.out.println(txt);
		}
	}
	
}
