package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EvenDROp {

	@Test
	public void drop(){
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement ele = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s=new Select(ele);
		List<WebElement> op = s.getOptions();
		int count=12;
		
		for(int i=1; i<=12; i++){
			if (i%2==0){
		  WebElement even = op.get(i);
				String txt = even.getText();
				System.out.println(txt);
			}
		}
		//System.out.println(mo);
	}
}
