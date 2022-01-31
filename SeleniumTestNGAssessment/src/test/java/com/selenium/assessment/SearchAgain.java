package com.selenium.assessment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchAgain {
	@Test(priority = 17)
	public void findUserAgain() throws InterruptedException {
		Thread.sleep(3000);
		//Create test case and description
		Config.test = Config.extent.createTest("Search a user again");

		//search for a user
		Config.driver.findElement(By.id("searchSystemUser_userName")).sendKeys(Locators.username);
		Thread.sleep(4000);
		
		
		Config.driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Jasmine Morgan");
		Config.driver.findElement(By.id("searchBtn")).click();
		Config.logger.info("Test Passed");
		

	}
}
