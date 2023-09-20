package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginTest_DAT extends BasicClass{
	
	
	@Test(dataProvider="LoginData")
	public void LoginTest(String em, String pas) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get(baseURLBS);
		logger.info("URL is Open");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(em);
		logger.info("Email is SEt");
		lp.setPassword(pas);
		logger.info("Password is set");
		lp.clickLoginButton();
		String extected="Dashboard / nopCommerce administration";
		if(driver.getTitle().equals(extected))
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
			lp.clickLogout();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println(lp.errorMassage());
			logger.info("Test Case Failed");
			Assert.assertTrue(false);
			
		}
	}

	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String ExcelFilePath=System.getProperty("user.dir") + "\\LoginData.xlsx\\";

		int rownum=xl.getRowCount(ExcelFilePath, "Sheet1");
		int colcount=xl.getCellCount(ExcelFilePath, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			
			for(int c=0;c<colcount;c++)
			{
				logindata[i-1][c]=xl.getCellData(ExcelFilePath, "Sheet1", i, c);
				
			}
		}
		return logindata;
	}
}
