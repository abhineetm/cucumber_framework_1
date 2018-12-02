package com.action;

import org.openqa.selenium.WebDriver;

public class LoginActions{
	
	WebDriver driver;
	
	
	
	public void launchBrowser(String url){
		
		System.out.println("launching browser and hit "+url+"");
	}

	public void enterUN(String un) {
		System.out.println("Enter UN "+un+"");
		
	}

	public void enterPWD(String pwd) {
		System.out.println("Enter PWD "+pwd+"");
		
	}

	public void clickSubmit() {
		System.out.println("Click Submit");
		
	}

	public void redirectHome() {
		System.out.println("Then Redirect to Home page");
		
	}

	

}
