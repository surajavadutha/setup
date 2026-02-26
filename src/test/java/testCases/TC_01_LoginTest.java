package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_01_LoginTest extends BaseClass
{
	@Test
	public void verify_login() 
	{
		logger.info("**Started**");
		try 
		{
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickSubmit();
			
			DashboardPage db = new DashboardPage(driver);
			boolean target = db.isDashboardexists();
			
			Thread.sleep(2000);
			
			Assert.assertTrue(target);
			
			
		}catch(Exception e) 
		{
			Assert.fail();
		}
		logger.info("**Finished**");
	}
	
	
	
	
}
