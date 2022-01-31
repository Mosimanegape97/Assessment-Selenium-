package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchUser {
	@Test(priority = 14)
	public void finduser() throws InterruptedException {

		Thread.sleep(5000);
		//Create test case and description
		Config.test = Config.extent.createTest("Click on the search button");
		//search user
		WebElement searchBtn = Config.driver.findElement(By.id("searchSystemUser_userName"));
		searchBtn.sendKeys(Locators.username);
		if (searchBtn.isEnabled()) {
			Config.driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys(Locators.name);
			
			
			Config.driver.findElement(By.id("searchBtn")).click();
			
			Thread.sleep(7000);
			Assert.assertTrue(true);
			Config.logger.info("Test Passed");
		}
		

	}
	
}
