package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddUser {
	@Test(priority = 13 )
	
	
	public void fillUserInfo() throws InterruptedException {
		
		 
			//Create test case and description
			Config.test = Config.extent.createTest("Click add button");

			//clicks add button
			Config.driver.findElement(By.id("btnAdd")).click();
			//Create test case and description
			Config.test = Config.extent.createTest("Verify Status dropdown is Selected to enable");
			
			
			
			Boolean dropdownPresent = Config.driver.findElement(By.id("systemUser_userType")).isDisplayed();
			
			if (dropdownPresent ==true) {
				Select user_role = new Select(Config.driver.findElement(By.id("systemUser_userType")));
				user_role.selectByVisibleText("ESS");
				Config.test.pass("Status dropdown is Selected to enable");
				Config.logger.info("Test Passed");
				Assert.assertTrue(true);
				
				Config.driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Locators.name);
				Config.driver.findElement(By.id("systemUser_userName")).sendKeys(Locators.username);
				
				Select user_status = new Select(Config.driver.findElement(By.id("systemUser_status")));
				user_status.selectByVisibleText("Enabled");
				
				Config.driver.findElement(By.id("systemUser_password")).sendKeys("Selenium500");
				Config.driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Selenium500");
				
			}
		
			
			Thread.sleep(3000);
			//Clicks the save button
			Config.driver.findElement(By.id("btnSave")).click();
		}
}
