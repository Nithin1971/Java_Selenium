package Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DDT_2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver", "./Pro-1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		 FileInputStream file=new FileInputStream("./Excel/DDT_1.xlsx");
		 Workbook wb = WorkbookFactory.create(file);
		 Sheet sh = wb.getSheet("Sheet1");
		 for(int i=0; i<link.size(); i++){
			 Row r = sh.createRow(i);
			 Cell c = r.createCell(0);
			 c.setCellValue(link.get(i).getAttribute("href"));
		 }
		 FileOutputStream fout=new FileOutputStream("./Excel/DDT_1.xlsx");
		 wb.write(fout);
	}
}
