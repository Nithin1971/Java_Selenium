package Practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("./Excel/DDT_1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet Sh = wb.getSheet("Sheet2");
		int rowcount=Sh.getLastRowNum()-Sh.getFirstRowNum();
		for(int i=0; i<rowcount+1; i++){
			Row r = Sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++){
				System.out.print(r.getCell(j).getStringCellValue()+" || ");
			}
			System.out.println();
		}
	}
}
