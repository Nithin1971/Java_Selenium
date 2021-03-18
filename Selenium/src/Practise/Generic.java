package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterMethod
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
