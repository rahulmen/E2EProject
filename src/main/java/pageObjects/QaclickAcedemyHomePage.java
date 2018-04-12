package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseClass;

public class QaclickAcedemyHomePage{
	WebDriver driver;
	
	public QaclickAcedemyHomePage(WebDriver driver){
		this.driver=driver;
	}
	
	By login = By.xpath("//i[@class='fa fa-lock fa-lg']/following-sibling::span");
	
	
	public WebElement loginButton() {
	return driver.findElement(login);
	}

}
