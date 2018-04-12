package com.academy;


import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.QaClickAcademyLoginPage;
import pageObjects.QaclickAcedemyHomePage;
import resources.BaseClass;

public class HomePage extends BaseClass{

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver=initilizeDriver(); //Return driver and we have stored in it driver we have defined in base class
		driver.get(defineProperty().getProperty("URL"));
	}
	
	//---------------------------------------------
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password) throws IOException {
	
		//There are two ways to access methods of another class inheritance and creating object of another class
		QaclickAcedemyHomePage objHomePage = new QaclickAcedemyHomePage(driver);
		objHomePage.loginButton().click();
		QaClickAcademyLoginPage objLoginPage = new QaClickAcademyLoginPage(driver);
		//explicitWait().until(ExpectedConditions.visibilityOfElementLocated(objLoginPage.emailAddress));
		objLoginPage.emailAddress().sendKeys(username);
		objLoginPage.password().sendKeys(password);
		objLoginPage.submit().click();	
		
	}
	//-----------------------------------------------
	@AfterTest
	public void driverclose() {
		driver.quit();
	}

	//Data provider that will provide data to browserLaunchTest

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "rahulmendiratta13";
		data[0][1] = "12345";
		
		data[1][0] = "rahulmendiratta13";
		data[1][1] = "12345";
		return data;
	}

}
