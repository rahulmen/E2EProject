package com.academy;

import java.io.IOException;

import pageObjects.QaClickAcademyLoginPage;
import pageObjects.QaclickAcedemyHomePage;
import resources.BaseClass;

import org.testng.Assert;
import org.testng.annotations.*;

public class ValidateTitle extends BaseClass{
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver=initilizeDriver(); //Return driver and we have stored in it driver we have defined in base class
		driver.get(defineProperty().getProperty("URL"));
	}

	@Test
	public void ValidateTitleWithAssertion() throws IOException {
		
		QaclickAcedemyHomePage objHomePage = new QaclickAcedemyHomePage(driver);
		//objHomePage.title().getText();
		//Write Assert to compare the two string values
		Assert.assertEquals(objHomePage.title().getText(), "FEATURED COURSES");
		Assert.assertFalse(!(objHomePage.mainLogo().isDisplayed()));
		
	}
	
	@AfterTest
	public void driverclose() {
		driver.close();
	}
	
}
