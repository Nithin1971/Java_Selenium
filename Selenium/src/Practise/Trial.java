package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pro-1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("pass");
		}
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
		
		Point p=new Point(100, 200);
		driver.manage().window().setPosition(p);
		
		Point po = driver.manage().window().getPosition();
		System.out.println("position "+po);
		
		Dimension Si  = driver.manage().window().getSize();
		System.out.println("Size "+Si );
		
		WebElement ele = driver.findElement(By.xpath("//button[@value='1']"));
		Point lo = ele.getLocation();
		System.out.println("location "+lo);
		
		Dimension Siz = ele.getSize();
		System.out.println(Siz);
		System.out.println(Siz.height);
		System.out.println(Siz.width);
		
		WebElement tit = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Point loc = tit.getLocation();
		System.out.println("kannada loc "+loc);
		System.out.println(loc.x);
	}
}
