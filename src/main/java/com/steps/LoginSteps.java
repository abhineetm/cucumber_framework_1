package com.steps;

import com.action.BaseClass;
import com.action.LoginActions;

import cucumber.api.java.en.*;

public class LoginSteps extends BaseClass {
	
	LoginActions la = new LoginActions();
	
	
	@Given("^Open browser and hit URL \"([^\"]*)\"$")
	public void open_browser_and_hit_URL(String url) throws Throwable {
		la.launchBrowser(url);
		}

	@When("^Enter UN \"([^\"]*)\"$")
	public void enter_UN(String un) throws Throwable {
		la.enterUN(un);
		
	}

	@When("^Enter PWD \"([^\"]*)\"$")
	public void enter_PWD(String pwd) throws Throwable {
		la.enterPWD(pwd);
		
	}

	@When("^Click on Submit$")
	public void click_on_Submit() throws Throwable {
		la.clickSubmit();
	}

	@Then("^Redirect to Home page$")
	public void redirect_to_Home_page() throws Throwable {
		la.redirectHome();
		
	}



}
