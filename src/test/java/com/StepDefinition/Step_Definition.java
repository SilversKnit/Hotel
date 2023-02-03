package com.StepDefinition;

import java.io.IOException;


import com.Base_Class.BaseClass;
import com.POM_Class.Login;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass {

	Login lg = new Login(driver);
	
	@Before
	public void BeforeHooks(Scenario s) {
		
		String name = s.getName();
		System.out.println(name);
		
	}
	
	
	@After
	public void AfterHooks(Scenario s) throws IOException {
	
		Status status = s.getStatus();
		System.out.println(status);
		
		if(s.isFailed()) {
			sshot("failed.png");
		}
		
	}


	@Given("user Enter {string} To Launch Website")
	public void user_enter_to_launch_website(String url) {
	   
		open_Website(url);
		implicitWait(25);
		
	}
	
	@When("user Enter {string} In The Username")
	public void user_enter_in_the_username(String username) {
	   
		passInput(lg.getUsername(), username);
		
	}
	
	@When("user Enter {string} In The Password")
	public void user_enter_in_the_password(String password) {
	  
		passInput(lg.getPassword(), password);
		
	}
	
	@Then("user Click Loginbutton For Validation")
	public void user_click_loginbutton_for_validation() {
		
		clickOnElement(lg.getSubmit());
		
	}

	
}
