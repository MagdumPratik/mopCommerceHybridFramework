package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginTest extends BasicClass{
	
	@Test
	public void LoginTest()
	{
		driver.get(baseURLBS);
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(emailBS);
		logger.info("Email is set");
		lp.setPassword(passBS);
		logger.info("Password is set");
		lp.clickLoginButton();
		logger.info("CLick on Login Button");
		String extected="Dashboard / nopCommerce administration";
		if(driver.getTitle().equals(extected))
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else
		{
			logger.info("Test Case Failed");
			Assert.assertTrue(false);
			
		}
	}
}
