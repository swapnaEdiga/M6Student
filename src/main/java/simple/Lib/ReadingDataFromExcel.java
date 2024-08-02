package simple.Lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\selenium\\M6TestCaseData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sample");
		String value=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
