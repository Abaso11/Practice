package TestScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.TestUtility;

public class Practice {
	WebDriver driver;
	Actions act;

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver_win32 (6)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(enabled = false)
	public void newtest() throws IOException {
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("9730601679");
		driver.findElement(By.xpath("//div[@class=\"_1k3JO2\"]/button")).click();
		TestUtility.screenShot(driver);

	}

	@Test(enabled = false)
	public void drag() {
		driver.navigate().to("https://demoqa.com/droppable/");
		Actions act = new Actions(driver);

		WebElement element1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[@id='droppable']"));

		act.dragAndDrop(element1, element2);

	}

	@Test()
	public void men() throws InterruptedException {
		Actions act = new Actions(driver);

		driver.navigate().to("https://www.meesho.com/");
		WebElement element3 = driver
				.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'][3]/span"));

		WebElement element4 = driver.findElement(By.xpath("//a[@href='/men-watches/pl/3k7']/p"));

		act.moveToElement(element3).moveToElement(element4).click().build().perform();

		Thread.sleep(5000);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
