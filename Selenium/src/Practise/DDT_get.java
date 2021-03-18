package Practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_get {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("./Excel/DDT_1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		Row r1 = sh.getRow(2);
		Cell c1 = r1.getCell(1);
		String value = c.getStringCellValue();
		System.out.println(value);
		String v = c1.toString();
		System.out.println(v);
		 
	}
}
