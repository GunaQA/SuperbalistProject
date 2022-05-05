package com.sup.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sup.qa.base.TestBase;
import com.sup.qa.pages.CartPage;
import com.sup.qa.pages.LoginPage;
import com.sup.qa.pages.UserPage;
import com.sup.qa.pages.WishlistPage;

public class UserPageTest extends TestBase{
	LoginPage loginPage;
	UserPage userPage;
	CartPage cartPage;
	WishlistPage wishlistPage;

	public UserPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		userPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void homePageCheck() {
		Assert.assertTrue(userPage.cartCheck());
	}

	@Test(priority=2)
	public void cartLinkCheck() {
		cartPage = userPage.cartPageClick();
	}

	@Test(priority=3)
	public void wishListLinkCheck() {
		Assert.assertTrue(userPage.wishlistCheck());
		wishlistPage = userPage.wishlistClick();
	}

	@AfterMethod
	public void quittingBrowser() {
		teardown();
	}



}
