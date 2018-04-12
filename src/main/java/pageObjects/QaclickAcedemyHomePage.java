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
	
	By title = By.xpath("//*[@id='content']/div/div");
	
	By mainLogo = By.cssSelector("div.navbar-header");
	
	public WebElement loginButton() {
	return driver.findElement(login);
	}
	
	public WebElement mainLogo() {
	return driver.findElement(mainLogo);
	}
	
	public WebElement title() {
		return driver.findElement(title);
	}

}
