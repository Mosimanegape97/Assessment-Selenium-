package com.selenium.assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle {
  
	//test
	@Test(priority = 1)
	public void test_case_one() throws Exception {



	//test case and description
	Config.test = Config.extent.createTest("Open orangeHRM url", "Get the title of the current page.");



	//link to the url
	Config.driver.get(Locators.web_url);



	//actual title and expected title
	String actualTitle = Config.driver.getTitle();
	String expectedTitle = Instance_Variables.web_title;



	//checks expected result and actual result matched
	Assert.assertEquals(actualTitle, expectedTitle);

	
	Thread.sleep(5000);
	Config.test.pass("Test Passed");
	Config.logger.info("Test Passed");
	}
	
}
