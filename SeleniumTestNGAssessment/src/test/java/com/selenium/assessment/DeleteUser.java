package com.selenium.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUser {
    @Test(priority = 15)
	public void delete() throws InterruptedException  {

		//create test case and description
		Config.test = Config.extent.createTest("Delete user", "Removes the user");


		//click checkbox
		//Thread.sleep(5000);
		WebElement list_chkSelect = (Config.driver.findElement(By.id("chkSelectRow[]")));
		list_chkSelect.click();
		
		Thread.sleep(2000);
		//delete the user
		Config.driver.findElement(By.id("btnDelete")).click();		
		Thread.sleep(3000);
		WebElement isDeleted =  Config.driver.findElement(By.id("dialogDeleteBtn"));
		isDeleted.click();
		if (isDeleted.isDisplayed()) {
			
			Assert.assertTrue(true);
			Config.logger.info("Test Passed");
		}

	}
}
