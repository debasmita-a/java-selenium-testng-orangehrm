package orangeHRM.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import orangeHRM.constants.FrameworkConstants;
import orangeHRM.exceptions.FrameworkException;
import orangeHRM.exceptions.InvalidPathForExcelException;

public final class ExcelUtil {

	private ExcelUtil() {
	}

	public static List<Map<String, String>> getData(String sheetname) {

		List<Map<String, String>> list = null;
		try (FileInputStream input = new FileInputStream(FrameworkConstants.getExcelfilePath())) {
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet sheet = workbook.getSheet(sheetname);

			Map<String, String> map = null;
			list = new ArrayList<>();

			int lastRowNum = sheet.getLastRowNum();
			int lastColNum = sheet.getRow(0).getLastCellNum();
			DataFormatter formatter = new DataFormatter();

			for (int i = 1; i <= lastRowNum; i++) {
				map = new HashMap<>();
				for (int j = 0; j < lastColNum; j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					// String value = sheet.getRow(i).getCell(j).getStringCellValue();
					String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
					map.put(key, value);
				}
				list.add(map);
			}
		} catch (FileNotFoundException e) {
			throw new InvalidPathForExcelException("Excel path is invalid");
			
		} catch (IOException e) {
			throw new FrameworkException("Excel path is invalid");
		
		}
		return list;
	}

}
