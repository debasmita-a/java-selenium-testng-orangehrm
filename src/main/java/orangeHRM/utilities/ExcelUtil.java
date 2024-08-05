package orangeHRM.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import orangeHRM.constants.FrameworkConstants;

public final class ExcelUtil {

	private ExcelUtil() {
	}

	public static List<Map<String, String>> getData() {
		List<Map<String, String>> list = null;
		try {
			FileInputStream input = new FileInputStream(FrameworkConstants.getExcelfilePath());
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet sheet = workbook.getSheet("invocationcount");

			Map<String, String> map = null;
			 list = new ArrayList<>();

			int lastRowNum = sheet.getLastRowNum();
			int lastColNum = sheet.getRow(0).getLastCellNum();

			for (int i = 0; i < lastRowNum; i++) {
				map = new HashMap<>();
				for (int j = 0; i < lastColNum; j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);
				}
				list.add(map);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
