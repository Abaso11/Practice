package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import TestBase.Base;
import net.bytebuddy.build.CachedReturnPlugin;

public class TestUtility extends Base {

	WebDriver driver;

	public static void screenShot(WebDriver driver) throws IOException {

		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;

		File scrFile = takesScreenShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("aba.png");

		Files.copy(scrFile, DestFile);
	}

	public static String runProperty(String key) throws IOException {
		Properties p = new Properties();
		File file = new File("C:\\Users\\Abhay\\eclipse-workspace\\DemoProject\\src\\test\\resources\\aba.properties");
		FileInputStream fis = new FileInputStream(file);
		p.load(fis);
		return p.getProperty(key);

	}

}
