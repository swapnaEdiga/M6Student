package genaric.Library;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	public void WriteDataInExcel(String sheetName,int rowNum,int cellNum,String value) throws Exception
	{
		FileInputStream fis=new FileInputStream(IconstantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelpath);
		book.write(fos);
		
	}

}
