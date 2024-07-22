package orangeHRM.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	@Test(dataProvider = "getData")
	public void test01(String un, String pass, String fn, String ln) {
		System.out.println(un);
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		FileInputStream input = new FileInputStream("./src/test/resources/excel/testdata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet sheet = workbook.getSheet("testdata");
			
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int row=1; row<=sheet.getLastRowNum(); row++) {
				for(int col=0; col<sheet.getRow(0).getLastCellNum(); col++) {
					data[row-1][col] = sheet.getRow(row).getCell(col).getStringCellValue();	
				}
			}
			
			return data;
	}
	
	@DataProvider
	public Object[][] getDataHashMap() throws IOException {
		FileInputStream input = new FileInputStream("./src/test/resources/excel/testdata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet sheet = workbook.getSheet("testdata");
			
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int row=1; row<=sheet.getLastRowNum(); row++) {
				for(int col=0; col<sheet.getRow(0).getLastCellNum(); col++) {
					data[row-1][col] = sheet.getRow(row).getCell(col).getStringCellValue();	
				}
			}
			
			return data;
	}
}
