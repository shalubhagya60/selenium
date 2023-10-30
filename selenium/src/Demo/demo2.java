package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./excel/test_data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row ro = sh.getRow(2);
		Cell cel = ro.getCell(3);
		String value = cel.toString();
		System.out.println(value);
		Row ro1 = sh.getRow(0);
		Cell cel1 = ro1.getCell(0);
		String value1 = cel1.toString();
		System.out.println(value1);
		Row ro2 = sh.getRow(1);
		Cell cel2 = ro2.getCell(1);
		String value2 = cel2.toString();
		System.out.println(value2);
	}

}
