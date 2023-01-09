package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebElement Email;
	WebElement password;
	WebElement rememberme;
	WebElement Loginbutton;

	/*
	 * public void loginTest(String Email,String pass) { setUserName();
	 * getUserName().sendKeys(Email);
	 * 
	 * setPassword(); getPassword().sendKeys(pass);
	 * 
	 * setSubmitButton(); getSubmitButton().click();
	 * 
	 * }
	 */

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail() {
		Email = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword() {
		password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
	}

	public WebElement getRememberme() {
		return rememberme;
	}

	public void setRememberme() {
		rememberme = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton() {
		loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	}

}
