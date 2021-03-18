package Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Project1.webelement;

public class DDT_create {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./Excel/DDT_1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.createRow(0);
		Cell c = r.createCell(1);
		c.setCellValue("Nithin");
		 FileOutputStream fileout = new FileOutputStream("./Excel/DDT_1.xlsx");
		 wb.write(fileout);
		 
		 WebElement ele;
		 Select s=new Select(ele);
		 s.selectByVisibleText(arg0);
		 
	}
}
