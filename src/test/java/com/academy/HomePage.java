package com.academy;


import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pageObjects.QaClickAcademyLoginPage;
import pageObjects.QaclickAcedemyHomePage;
import resources.BaseClass;

public class HomePage extends BaseClass{
	
	@Test
	public void browserLaunch() throws IOException, InterruptedException {
		driver=initilizeDriver(); //Return driver and we have stored in it driver we have defined in base class
		driver.get(defineProperty().getProperty("URL"));
		
		//There are two ways to access methods of another class inheritance and creatin object of another class
		
		QaclickAcedemyHomePage objHomePage = new QaclickAcedemyHomePage(driver);
		objHomePage.loginButton().click();
		QaClickAcademyLoginPage objLoginPage = new QaClickAcademyLoginPage(driver);
		explicitWait().until(ExpectedConditions.visibilityOfElementLocated(objLoginPage.emailAddress));
		objLoginPage.emailAddress().sendKeys("Rahul@gmail.com");
		objLoginPage.password().sendKeys("Mendiratta");
		objLoginPage.submit().click();
		
		
	}
	
	/*@Test
	public void clickLogin() throws IOException {
		QaclickAcedemyHomePage objHomePage = new QaclickAcedemyHomePage();
		objHomePage.driver = initilizeDriver();
		objHomePage.driver.get("http://www.qaclickAcademy.com");
		objHomePage.loginButton().click();
		QaClickAcademyLoginPage objLoginPage = new QaClickAcademyLoginPage();
		objLoginPage.emailAddress().sendKeys("Rahul");
		objLoginPage.password().sendKeys("Mendiratta");
		objLoginPage.submit().click();

	}*/
	

}
