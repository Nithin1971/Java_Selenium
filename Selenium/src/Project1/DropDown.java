package Project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public void drop(){
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		List<WebElement> list = driver.findElements(By.xpath("//select[@title='Month']"));
		ArrayList<String> arr=new ArrayList<String>();
		 int count = list.size();
		for(int i=count-1;  i>=0; i--){
			WebElement txt = list.get(i);
			String stxt = txt.getText();
			arr.add(stxt);
			
		}
		//Collections.sort(arr);
		for(String s:arr){
			System.out.println(s);
		}
		driver.close();
	}
}
