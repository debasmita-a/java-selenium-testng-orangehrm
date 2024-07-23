package orangeHRM.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	@Test(dataProvider = "getDataHashMap")
	public void test01(Map<String, String> map) {
		System.out.println(map.get("username"));
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		FileInputStream input = new FileInputStream("./src/test/resources/excel/testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("testdata");

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int row = 1; row <= sheet.getLastRowNum(); row++) {
			for (int col = 0; col < sheet.getRow(0).getLastCellNum(); col++) {
				data[row - 1][col] = sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}

		return data;
	}

	@DataProvider
	public Object[] getDataHashMap() throws IOException {
		FileInputStream input = new FileInputStream("./src/test/resources/excel/testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("testdata");

		Object[] data = new Object[sheet.getLastRowNum()];
		Map<String, String> map;

		for (int row = 1; row <= sheet.getLastRowNum(); row++) {
			map = new HashMap<>();
			for (int col = 0; col < sheet.getRow(0).getLastCellNum(); col++) {

				String key = sheet.getRow(0).getCell(col).getStringCellValue();
				String value = sheet.getRow(row).getCell(col).getStringCellValue();
				map.put(key, value);
				data[row-1] = map;
			}
		}
		return data;
	}
}
