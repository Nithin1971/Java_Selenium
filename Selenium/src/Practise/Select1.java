package Practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/select.html");
		WebElement d = driver.findElement(By.id("Gundu palav"));
		Select S1=new Select(d);
		S1.selectByIndex(2);
		Thread.sleep(1000);
		S1.selectByValue("a");
		Thread.sleep(1000);
		S1.selectByVisibleText("chicken fry");
		Thread.sleep(1000);
		S1.deselectByIndex(2);
		Thread.sleep(1000);
		//S1.deselectByValue("a");
		//S1.deselectAll();
		Thread.sleep(1500);
		System.out.println(S1.getFirstSelectedOption());
		//driver.close();
		
		
	}
}
