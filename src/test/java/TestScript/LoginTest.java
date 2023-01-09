package TestScript;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.Base;
import Utilities.TestUtility;

public class LoginTest {
	public WebDriver driver;
	LoginPage loginPage;

	@BeforeMethod
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[contains(text(), 'Return Policy')]")).click();
		// driver.navigate().to("https://www.amazon.com/");
	}

	@Test
	public void login() throws IOException {
		
		

		TestUtility.screenShot(driver);

	}

	@AfterMethod
	public void tearDown() {

		driver.close();
	}
}