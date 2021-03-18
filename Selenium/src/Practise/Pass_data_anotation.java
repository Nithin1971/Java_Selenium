package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Pass_data_anotation {
	@Test
	public void Sample(){
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		//String Browser=System.getProperty("browser");
		WebDriver driver=new FirefoxDriver();
		String url=System.getProperty("url");
		driver.get(url);
	}
}
