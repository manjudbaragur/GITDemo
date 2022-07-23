package alpha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class ExcelData {

	@SuppressWarnings("resource")
	
	public ArrayList<String> getdata(String sheetname, String testname) throws IOException {
		ArrayList<String> a=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\52008917\\eclipse-workspace\\MvnJava\\src\\main\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetname))
			{
				
				XSSFSheet sheet=workbook.getSheetAt(i);
				
			Iterator<Row> rows=sheet.iterator();
			Row headers=rows.next();
			Iterator<Cell> cells=headers.iterator();
			int k=0;
			int column = 0;
			while(cells.hasNext())
			{
				Cell value=cells.next();
				if(value.getStringCellValue().equalsIgnoreCase(testname))
				{
					column=k;
				}
			k++;
			}
		
			
			while(rows.hasNext())
			{
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
				{
					Iterator<Cell> cv=r.cellIterator();
					while(cv.hasNext())
					{
						Cell c= cv.next();
						if(c.getCellType()==CellType.STRING)
						{

						a.add(c.getStringCellValue());
						}
						else{

						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

						}
						//a.add(cv.next().getStringCellValue());
					}
				}
			}
				
			}
			
			
		}
		return a;
	}
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.out.println("Ready to open");	
		
	}

}
