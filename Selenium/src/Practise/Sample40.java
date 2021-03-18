package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sample40 extends Generic {

	@Test
	public void Drop()
	{
		WebElement dd = driver.findElement(By.id("a1"));
		Select s1=new Select(dd);
		List<WebElement> op = s1.getOptions();
		for(WebElement w1:op)
		{
			String txt = w1.getText();
			if(txt.startsWith("a")){
				System.out.println(txt);
			}
		}
	}
}
