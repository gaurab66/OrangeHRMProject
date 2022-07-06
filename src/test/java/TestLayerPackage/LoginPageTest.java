package TestLayerPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.LoginPage;

public class LoginPageTest extends BaseClass {

	private LoginPage loginpage = new LoginPage(driver);

	@BeforeClass
	public void setup() {
		BaseClass.initialization();
	}

	@Test(priority=1)
	public void ValidateLoginPageLogoDisplayedStatus() {
		Assert.assertEquals(loginpage.checkDisplayLogo(), true);
}
     //VALIDATE LOGINPAGE TITLE AND URL
	@Test(priority=2)
	public void validateLoginPageTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	public void validateLoginPageUrl() {
		Assert.assertEquals(driver.getCurrentUrl().contains("orangehrmlive"), true);

		//Assert.assertEquals(driver.getCurrentUrl().contains("login"), true);
	}
	//TEST CASES OF USERNAME
	@Test(priority=4)
	public void validateUsernameDislayedStatus() {
		Assert.assertEquals(loginpage.checkDisplayUsername(), true);
	}
	@Test(priority=5)
	public void validateUsernameEnabledStatus() {
		Assert.assertEquals(loginpage.checkEnabledUsename(), true);
	}
	@Test(priority=6)
	public void validateCleaevalue() {
		loginpage.clearOldUsernameText();
	}
	@Test(priority=7)
	public void validateEnterUsernameValue() {
		loginpage.enterDataInUsername("Admin");
		Assert.assertEquals(loginpage.captureTheUsernameValue(), "Admin");
	}
	
	//TEST CASE ON PASSWORDy
	@Test(priority=8)
	public void validatePassworddisplayedStatus() {
		Assert.assertEquals(loginpage.checkDisplayPassword(),true);
	}
	@Test(priority=9)
	public void validatePasswordEnabledstatus() {
		Assert.assertEquals(loginpage.checkEnablePassword(), true);
	}
	@Test(priority=10)
	public void validateclearOldPasswordText() {
		loginpage.clearOldPasswordText();
	}
	@Test(priority=11)
	public void validateEnterPasswordValue() {
	loginpage.enterDataPassord("admin123");
	
	}
	
	//TEST CASE FOR LOGINBUTTON 
	
	@Test(priority=12)
	public void validateLoginDisplayedStatus() {
		Assert.assertEquals(loginpage.checkDisplayLogin(),true);
	}
	
	
	@Test(priority=13)
	public void validateLoginEnabledstatus() {
		Assert.assertEquals(loginpage.checkEnablePassword(),true );
	}
	
	
	@Test(priority=14)
	public void validatecaptureLoginButtonValue() {
		Assert.assertEquals(loginpage.captureLoginBUttonValue(), "LOGIN");
	}
	
	
	@Test(priority=15)
	public void validateClickLoginButton() {
		loginpage.clickLogin();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
