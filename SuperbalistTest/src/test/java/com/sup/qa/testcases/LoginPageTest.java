package com.sup.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sup.qa.base.TestBase;
import com.sup.qa.pages.LoginPage;
import com.sup.qa.pages.UserPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	UserPage userPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	
	@Test
	public void urlTest() {
		Assert.assertTrue(loginPage.urlCheck());
	}
	
	//@Test(priority=1)
	public void loginTest() {
		userPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(loginPage.loginCheck());
	}
	@AfterMethod
	public void quittingBrowser() {
		teardown();
	}

	

}
