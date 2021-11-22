package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import reusableClass.Base;

public class excelSheet extends Base {

	public static String getExcelSheetData(String sheetName, int rowNo, int cellNo) throws IOException {
		String excelsheetPath = "";
		FileInputStream excelBook = new FileInputStream(excelsheetPath);
		XSSFWorkbook workbook = new XSSFWorkbook(excelBook);
		//int sheet = workbook.getNumberOfSheets();
		String cellData = null;
		Iterator<Sheet> wk = workbook.iterator();
		while (wk.hasNext()) {
			Sheet currentSheet = wk.next();
			if (currentSheet.getSheetName().equalsIgnoreCase(sheetName)) {
				Row currentRow = currentSheet.getRow(rowNo);
				Cell currentCell = currentRow.getCell(cellNo);
				if (currentCell.getCellType()==CellType.STRING)
				{
					cellData = currentCell.getStringCellValue();
				}
				else
				{
					cellData = String.valueOf(currentCell.getNumericCellValue());
				}

			} else {
				System.out.print(sheetName + " Sheet Not Found");
			}

		}
		return cellData;

	}

}
