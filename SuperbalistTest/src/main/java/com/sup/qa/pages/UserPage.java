package com.sup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sup.qa.base.TestBase;

public class UserPage extends TestBase{
	
	public UserPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement cartButton;
	
	public boolean cartCheck() {
		return cartButton.isDisplayed();
	}
	
	public CartPage cartPageClick() {
		cartButton.click();
		return new CartPage();
	}
	
	@FindBy(xpath="//ul/descendant::span[contains(text(),'Wishlist')]")
	WebElement wishlistBtn;
	
	public boolean wishlistCheck() {
		expWait(wishlistBtn);
		return wishlistBtn.isDisplayed();
	}
	
	public WishlistPage wishlistClick() {
		expWait(wishlistBtn);
		wishlistBtn.click();
		return new WishlistPage();
	}
	
	

}
