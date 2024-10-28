package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = book.getSheetAt(0); //index of sheet
		// XSSFSheet sheet = book.getSheet("CreateLead");//sheet name

		int RowCount = sheet.getLastRowNum();
		int RowCount1 = sheet.getPhysicalNumberOfRows();// includes header
		int CellCount = sheet.getRow(1).getLastCellNum();
		System.out.println(
				"Row Count: " + RowCount + " ,Row count with header: " + RowCount1 + " ,Column Count: " + CellCount);

		// get entire data from excel.
		for (int i = 1; i <= RowCount; i++) {
			for (int j = 0; j < CellCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		book.close();
	}

}
