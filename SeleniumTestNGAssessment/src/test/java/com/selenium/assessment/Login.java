package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends Config {
  
	//creating object for login with username and password
	@DataProvider(name="test")
	public Object[][] getData() {
	Object[][] obj = new Object[1][2];
	obj[0][0]= Instance_Variables.login_user;
	obj[0][1]= Instance_Variables.login_passw;



	//returning object
	return obj;
	}



	//test
	@Test(dataProvider="test", priority = 2)
	public void login(String username,String password) throws InterruptedException {



	Config.driver.findElement(By.name(Locators.login_username)).sendKeys(username);
	Config.driver.findElement(By.name(Locators.login_password)).sendKeys(password);



	Thread.sleep(3000);



	//clicks submit button
	Config.driver.findElement(By.name("Submit")).click();
	}
	
	@Test(priority = 3)



	
	public void validateUrl() {



	//test case and description
	Config.test = Config.extent.createTest("Url contain dashboard keyword", "Validate that url contain dashboard keyword.");



	//keyword
	String keyword = Locators.keyword;



	//checks url contain keyword or not
	if(Config.driver.getCurrentUrl().contains(keyword)) {
	result = true;
	Config.test.pass("url contain keyword dashboard");
	Config.logger.info("Test Passed");
	}
	else {
	result = false;
	Config.test.fail("url does not contain keyword dashboard");
	}



	//checks expected result against actual result
	Assert.assertTrue(result);
	}



	
	@Test(priority = 4)



	
	public void validateAdminTab() {



	//test case and description
	Config.test = Config.extent.createTest("admin tab should display", "validate if admin tab is displayed.");



	//invokes web element by linkText
	WebElement admin_tab = Config.driver.findElement(By.linkText(Locators.admin_tab));



	// is admin tab displayed
	if(admin_tab.isDisplayed()) {
	Config.test.pass("Admin tab is displayed");
	Config.logger.info("Test Passed");
	}
	}



	//test
	@Test(priority = 5)



	//validating welcome admin tab
	public void validateWelcomeAdmin() {



	//test case and description
	Config.test = Config.extent.createTest("Welcome Admin should display at right panel", "Validate that welcome Admin should display at right panel");



	//calling web element by linkText
	WebElement welcome_admin = Config.driver.findElement(By.id(Locators.welcome_admin));



	//checking if welcome admin tab is displayed at right panel or not
	if(welcome_admin.isDisplayed()) {
	Config.test.pass("Test Passed. welcome Admin is displayed");
	Config.logger.info("Test Passed");
	}
	}
	
}
