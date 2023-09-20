package TestCases;

import org.testng.annotations.Test;

import PageObject.AddNewCustomer;
import PageObject.LoginPage;

public class LoginPageAddCustomer extends BasicClass {
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		driver.get(baseURLBS);
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(emailBS);
		lp.setPassword(passBS);
		lp.clickLoginButton();
		Thread.sleep(3000);
		
		AddNewCustomer ac=new AddNewCustomer(driver);
		ac.clickONCustomer();
		ac.clickonCustomeR2();
		ac.addCustomer();
		ac.addEmail("ABCD1234@gmail.com");
		ac.Password("12345678");
		ac.FirstName("Pratik");
		ac.LastName("Magdum");
		ac.setDate("12-10-1998");
		ac.companyName("PratikLimited");
		ac.checkBoxSelect();
		ac.selectClass(1);
		ac.selectClass2(1);
		ac.selectClass3(1);
		ac.checkBoxSelect1();
		ac.addComment("This is My first Commit");
		
		
	}

}
