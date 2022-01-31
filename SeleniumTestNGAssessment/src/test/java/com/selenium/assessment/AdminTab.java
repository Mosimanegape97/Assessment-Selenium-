package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;

public class AdminTab {
	//test
	@Test(priority = 6)




	public void test_case_three() {
		//click to navigate to admin tab
		Config.driver.findElement(By.linkText(Locators.admin_tab)).click();
	}



	//test
	@Test(priority = 7)



	//validating admin Url
	public void validateAdminUrl() {



		//test case and description
		Config.test = Config.extent.createTest("Url should contain admin/viewSystemUsers", "Validate that url contain admin/viewSystemUsers");



		//admin url
		String admin_url = Locators.admin_url;



		//checking if current url contains admin url
		
		Config.test.pass("url contain admin/viewSystemUsers");
		Config.logger.info("Test Passed");
	}



	//test
	@Test(priority = 8)
	public void validateAdd () {



		//test case and description
		Config.test = Config.extent.createTest("Add button should be displayed", "Validate that add button is displayed");



		//invokes web element
		WebElement btnAdd = Config.driver.findElement(By.name(Locators.btnAdd));



		//checks add button is displayed 
		if(btnAdd.isDisplayed()) {
			Config.test.pass("save button is displayed");
			Config.logger.info("Test Passed");
		}
	}



	//test
	@Test (priority = 9)
	public void validateDelete() {



		//test case and description
		Config.test = Config.extent.createTest("Delete button should be displayed", "Validate that delete button is displayed");



		//invokes web element
		WebElement delete_btn = Config.driver.findElement(By.name(Locators.delete_btn));



		//checks delete button is displayed 
		if(delete_btn.isDisplayed()) {
			Config.test.pass("delete button is displayed");
			Config.logger.info("Test Passed");
		}
	}



	//test
	@Test(priority = 10)
	public void validateSearch() {



		//test case and description
		Config.test = Config.extent.createTest("Search button should be displayed", "Validate that search button is displayed");



		//invokes web element 
		WebElement searchBtn = Config.driver.findElement(By.id(Locators.searchBtn));



		//checks search button is displayed ]
		if(searchBtn.isDisplayed()) {
			Config.test.pass("search button is displayed");
			Config.logger.info("Test Passed");
		}
	}



	//test
	@Test(priority = 11)
	public void validateReset()  {



		//test case and description
		Config.test = Config.extent.createTest("Reset button should be displayed", "Validate that reset button is displayed");

		//invokes web element
		WebElement resetBtn = Config.driver.findElement(By.id(Locators.resetBtn));

		//checks reset button is displayed 
		if(resetBtn.isEnabled()) {
			Config.test.pass("reset button is displayed");
			Config.logger.info("Test Passed");
		}
	
	}

}
