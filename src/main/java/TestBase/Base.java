package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public Base() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhay\\eclipse-workspace\\DemoProject\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		

	}

}
