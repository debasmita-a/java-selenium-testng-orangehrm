package orangeHRM.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import orangeHRM.constants.FrameworkConstants;
import orangeHRM.enums.CategoryType;

public final class ExtentReportUtil {

	private ExtentReportUtil() {
	}

	private static ExtentReports extent;

	public static void initReports() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportpath()); // html file
																											// will be
																											// generated
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("OrangeHRM Automation Report");
			spark.config().setReportName("Regression Report");
			extent.attachReporter(spark);
		}
	}

	public static void flushReports() {
		if (Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentManager.unloadExtentTest();
		try {
			Desktop.getDesktop().browse(new File("index.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void createTest(String testname) {
		ExtentManager.setExtentTest(extent.createTest(testname));
	}
	
	public static void addAuthors(String[] authors) {
		for(String author : authors) {
			ExtentManager.getExtentTest().assignAuthor(author);
		}
	}
	
	public static void addCategories(CategoryType[] categories) {
		for(CategoryType category : categories) {
			ExtentManager.getExtentTest().assignCategory(category.toString());
		}
	}
}
