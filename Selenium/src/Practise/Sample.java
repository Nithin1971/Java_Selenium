package Practise;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./Pro-1/geckodriver.exe";
		System.setProperty(key, value);
		
		FirefoxDriver Driver=new FirefoxDriver();
	}
}
