package Framework;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class com_flipkart_ts1 {
	@Test
	public void testscript1(){
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> amountlist = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		TreeSet<String> Tarr=new TreeSet<>();
		for(WebElement amtlist:amountlist){
			String txt = amtlist.getText();
			Tarr.add(txt);
		}
		System.out.println(Tarr);
		driver.close();	
	}
}
