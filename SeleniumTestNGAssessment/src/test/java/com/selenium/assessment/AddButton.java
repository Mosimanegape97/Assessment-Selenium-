package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddButton {



	@Test(priority = 12)	
	public void validateUrl () {


		//Create test case and description
		Config.test = Config.extent.createTest("url should contain saveSystemUser");

		//
		String addBtnKeyword = Locators.addBtnKeyword;

		//checks if url has keyword or not
		if(Config.driver.getCurrentUrl().contains(addBtnKeyword)) {

			Config.test.pass("url has saveSystemUser");
			Config.logger.info("Test Passed");
			


		}
		else {

			Config.test.fail("url doesnt have saveSystemUser");
			Config.logger.info("Test Failed");
		}
	}

	


}
	




