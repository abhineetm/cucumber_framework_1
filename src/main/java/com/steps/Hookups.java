package com.steps;

import java.net.MalformedURLException;

import com.action.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
/*
 How to set the Order or Priority of Cucumber Hooks?
The very important thing to note here is:

@Before(order = int) : This runs in increment order, means value 0 would run first and 1 would be after 0.
@After(order = int) : This runs in decrements order, means apposite of @Before. Value 1 would run first and 0 would be after 1.
  */

public class Hookups {
	BaseClass bc= new BaseClass();
	
	@Before(order=1)
	public void testa() throws MalformedURLException, InterruptedException{
		System.out.println("I am in before >> testa method");
		
	}
	@Before(order=2)
	public void zinti() throws MalformedURLException, InterruptedException{
		System.out.println("I am in before >> inti method");
		bc.createLocalDriver();
		
	}
	@After(order=2)
	public void testb(){
		System.out.println("I am in after >> testb method");
		
	}
	@After(order=1)
	public void zcleanup(){
		System.out.println("I am in after >> cleanup method");
		bc.closeDriver();
		
	}

	

	
	
}
