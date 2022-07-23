package MvnPro.MvnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {

	ExtentReports extent;
	@Test
	public void InitialDemo() {
		// TODO Auto-generated method stub
		extent.createTest("InitialDemo");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--Incognito");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		extent.flush();
	}

	@BeforeTest
	public void confg() {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir") + "\\Reports\\HtmlReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Application TestResults");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Manjunath", "D Groups");
	}
}
