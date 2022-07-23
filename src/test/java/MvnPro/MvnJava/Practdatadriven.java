package MvnPro.MvnJava;

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
public class Practdatadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("resource")
	public String getexceldata(String sheetname, String testcase, String headerValue) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		String xyz = null;
		double parsevalue;
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\52008917\\eclipse-workspace\\MvnJava\\src\\main\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetname)) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				int k = 0, column = 0;
				while (rows.hasNext()) {
					Row row1 = rows.next();
					Iterator<Cell> c = row1.iterator();
					while (c.hasNext()) {
						Cell cv = c.next();

						if (cv.getStringCellValue().equalsIgnoreCase(headerValue)) {
							column = k;
							break;
						}
						k++;
					}
					if (row1.getCell(0).getStringCellValue().equalsIgnoreCase(testcase)) 
					{
						if(row1.getCell(column).getCellType()==CellType.STRING)
						{
						xyz=row1.getCell(column).getStringCellValue();
						}
						else
							if(row1.getCell(column).getCellType()==CellType.NUMERIC)
						{
							parsevalue=row1.getCell(column).getNumericCellValue();
							System.out.println(parsevalue);
						xyz=Double.toString(parsevalue);
						}
						break;
					}
				}
			}
		}
		return xyz;
	}
}
