package Practise;

import org.testng.annotations.Test;

public class Sample41 extends Generic {

	@Test
	public void kolki()
	{
		driver.get("https://www.flipkart.com");
		String src = driver.getPageSource();
		System.out.println(src);
		String tit = driver.getTitle();
		System.out.println(tit);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
}
