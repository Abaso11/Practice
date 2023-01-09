package TestScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class PageValidation {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(enabled = false)

	public void linkvalidation() {

		WebElement user = driver.findElement(By.xpath("//input[@name='userName']"));

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		int U_location = user.getLocation().getX();
		int P_loaction = password.getLocation().getX();

		System.out.println(U_location == P_loaction);
		int U_width = user.getSize().getWidth();
		int P_width = password.getSize().getWidth();

		System.out.println(U_width == P_width);
		int U_height = user.getSize().getHeight();
		int P_height = password.getSize().getHeight();
		System.out.println(U_height == P_height);

	}

	@Test(enabled = false)
	public void activeElement() {

		System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).isEnabled());

	}
	@Test
	public void Cleartextfromtxtbox() {
		WebElement user = driver.findElement(By.xpath("//input[@name='userName']"));
		user.sendKeys("abaso");
	String value =	user.getAttribute("value");
	System.out.println(value); 
	}

	@BeforeMethod
	public void teardown() {

		driver.close();

	}
}
