package com.academy;

import java.io.IOException;

import pageObjects.QaClickAcademyLoginPage;
import pageObjects.QaclickAcedemyHomePage;
import resources.BaseClass;

import org.testng.Assert;
import org.testng.annotations.*;

public class ValidateTitle extends BaseClass{

	@Test
	public void ValidateTitleWithAssertion() throws IOException {
		
		driver = initilizeDriver();
		driver.get(defineProperty().getProperty("URL"));
		QaclickAcedemyHomePage objHomePage = new QaclickAcedemyHomePage(driver);
		//objHomePage.title().getText();
		//Write Assert to compare the two string values
		Assert.assertEquals(objHomePage.title().getText(), "FEATURED COURSES");
		Assert.assertTrue(!(objHomePage.mainLogo().isDisplayed()));
		
	}
	
}
