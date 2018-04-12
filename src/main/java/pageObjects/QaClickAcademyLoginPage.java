package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class QaClickAcademyLoginPage {

	WebDriver driver;

	public QaClickAcademyLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public By emailAddress= By.id("user_email");
	public By password = By.id("user_password");
	public By submit = By.name("commit");

	public WebElement emailAddress() {
		return driver.findElement(emailAddress);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

}
