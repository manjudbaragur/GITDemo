package MvnPro.MvnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

@SuppressWarnings("unused")
public class PractCodeTest {

	@Test
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\52008917\\eclipse-workspace\\MvnJava\\src\\main\\data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("data"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				Iterator<Row> rows=sheet.rowIterator();
				while(rows.hasNext())
				{
					Row rows1=rows.next();
					System.out.println(rows1.getCell(i).getStringCellValue());
				}
			}
		}
		
		

	}

}
