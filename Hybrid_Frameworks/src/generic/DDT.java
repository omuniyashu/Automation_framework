package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {
public static String ddt(String sheet1,int row1,int cell1) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./excel.Book1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheet1);
	Row row = sheet.getRow(row1);
	Cell cell = row.getCell(cell1);
	String value= cell.toString();
	return value;
}
}
