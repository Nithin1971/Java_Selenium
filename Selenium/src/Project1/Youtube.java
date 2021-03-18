package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sbtc']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Allok");
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='ad-text:7']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='like this video along with 365,099 other people']")).click();
	 	//Thread.sleep(1500);
	}
}
