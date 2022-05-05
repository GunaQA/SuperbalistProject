package com.sup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sup.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Initializing Page Factory
	public LoginPage() {

	PageFactory.initElements(driver, this);
	
	}
	//Page Factory
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginPop;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[(text()='Gunasuresh')]")
	WebElement logName;
	
	//Actions to perform in this page
	
	public boolean urlCheck() {
		return driver.getCurrentUrl().contains("superbalist");
		
	}
	
	public UserPage login(String user, String pass) {
		loginPop.click();
		email.sendKeys(user);
		password.sendKeys(pass);
		loginBtn.click();
		return new UserPage();
	}
	
	public boolean loginCheck() {
		return logName.isDisplayed();
	}

}
