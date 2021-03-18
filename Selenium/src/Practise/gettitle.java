package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gettitle {
	@Test
	public void titleget(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");
		String txt = driver.findElement(By.tagName("title")).getAttribute("text");
		System.out.println(txt);
	}
}
