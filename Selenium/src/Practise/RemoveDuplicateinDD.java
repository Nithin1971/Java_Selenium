package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class RemoveDuplicateinDD {
	public void removeduplicate(){
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NITHIN/Desktop/HTML/Adropdown.html");
		WebElement dd = driver.findElement(By.xpath("//select[@id='a1']"));
		Dimension size = driver.manage().window().getSize();
		System.out.println("height "+size.getHeight());
		System.out.println("width "+size.getWidth());
		Select s=new Select(dd);
		List<WebElement> op = s.getOptions();
		ArrayList<String>arr=new ArrayList<String>();
		TreeSet<String> ts=new TreeSet<String>();
		for(int i=0; i<op.size(); i++){
			WebElement sop = op.get(i);
			String txt = sop.getText();
			ts.add(txt);
		}
		for(String t:ts){
			System.out.println(t);
		}
//		for(int i=0; i<op.size();i++){
//			String txt = op.get(i).getText();
//			arr.add(txt);
//		}
//	
//		for(int i=0; i<arr.size(); i++){			
//			for(int j=i+1; j<arr.size(); j++){				
//				if(arr[i]==arr[j]&&arr[i]!="0"){
//					arr[j]="0";
//				}
//			}
//		}
//		for(int i=0; i<arr.size(); i++){
//			if(arr[i]!="0"){
//				System.out.println(i);
//			}
//		}
		
	}
}
