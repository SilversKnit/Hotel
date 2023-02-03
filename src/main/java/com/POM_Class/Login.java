package com.POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//input[@name= 'username']")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type= 'Submit']")
	WebElement submit;

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	} 
	

	
	
	
}
