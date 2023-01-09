package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtntReport {
	WebDriver driver;

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		extent.attachReporter(spark);
		

		

	}

	@Test
	public void verify() {
		
		extent.createTest("verify").assignAuthor("Aba").assignCategory("smoke").log(Status.INFO, "verify succesfully");
		
		Assert.assertEquals(driver.getTitle(), "google.com");

	}

	@AfterMethod
	public void teardown() {
		extent.flush();
		driver.close();
		
		
		
		

	}

}
