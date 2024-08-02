package simple.Lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genaric.Library.IconstantUtility;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=1;j<=r.getLastCellNum()-1;j++)
			{
				String values=format.formatCellValue(r.getCell(j));
				System.out.println(values);
			}
			
		}
		
		
		
	}

}



