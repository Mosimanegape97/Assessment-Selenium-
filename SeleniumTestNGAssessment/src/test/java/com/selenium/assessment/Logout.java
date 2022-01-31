package com.selenium.assessment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout {
	@Test(priority = 17)
	public void exitApp() throws Exception {
		//Create test case and description
		Config.test = Config.extent.createTest("Logout","exit the application");
		
		
		Config.driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
	
		//Config.driver.findElement(By.linkText("/index.php/auth/logout")).click();
		Config.driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		PageTitle mypage = new PageTitle();
		mypage.test_case_one();
		Config.logger.info("Test Passed");
	}
}
