package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBys({@FindBy(xpath="//input[@name='password']"),@FindBy(xpath="//input[@type='password']")})
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}




	

}
