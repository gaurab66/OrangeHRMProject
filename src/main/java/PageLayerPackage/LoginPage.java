package PageLayerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import BaseLayerPackage.BaseClass;

public class LoginPage extends BaseClass {
	private By username=By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginButton = By.id("btnLogin");
	private By logo = By.xpath("//img[contains(@src,'logo')]");
	private By forgotLink = By.xpath("//a[contains(text(),'Forgot')]");
	private By message = By.id("spanMessage");
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;}
	
	
	//Operation on Username isDisplayed,isEnabled,Senddata,capture data,clear data
		
	public boolean checkDisplayUsername() {
	return driver.findElement(username).isDisplayed();	
	}
	
	public boolean checkEnabledUsename() {
		return driver.findElement(username).isEnabled();
	}
	
	public void enterDataInUsername(String value) {
		driver.findElement(username).sendKeys(value);
	}
	
	public String captureTheUsernameValue() {
		return driver.findElement(username).getAttribute("value");
	}
	
	public void clearOldUsernameText() {
		driver.findElement(username).clear();
	}
	
	//Operations on Password==Displayed,Enable,EnterData,capture the Data,clear
	
	public boolean checkDisplayPassword() {
		return driver.findElement(password).isDisplayed();
		
	}
	public boolean checkEnablePassword() {
		return driver.findElement(password).isEnabled();
	}
	
	public void enterDataPassord(String value) {
		driver.findElement(password).sendKeys(value);	
	}
	
	
	public void clearOldPasswordText() {
		driver.findElement(password).clear();
		
	}
	
	//Operation on loginbutton:: displayed,enabled,click,capture button value
	
	public boolean checkDisplayLogin() {
		return driver.findElement(loginButton).isDisplayed();
		
	}
	
    public boolean checkEnableLogin() {
    	return driver.findElement(loginButton).isEnabled();
    	
    }
		public String captureLoginBUttonValue() {
			return driver.findElement(loginButton).getAttribute("value");
		}
		
		
		public void clickLogin() {
			driver.findElement(loginButton).click();
		}
		
		//Operation on forgetpassword link==displayed,enebled,capturelinkname,click
		
		public boolean checkDisplayForgetPass() {
			return driver.findElement(forgotLink).isDisplayed()
;		}
		
        public boolean checkEnabledForgetPass() {
        	return driver.findElement(forgotLink).isEnabled();
        }
		
		public String captureForgetPassButtonValue() {
			return driver.findElement(forgotLink).getAttribute("value");
			
		}
		
		public void clickForgetPass() {
			driver.findElement(forgotLink).click();
			
		}
		
		
		//Opertation on Logo==isDispalyed
		
		public boolean checkDisplayLogo() {
			return driver.findElement(logo).isDisplayed();
		}
		
		//Operation on error message==display,capture error message
		
		public boolean checkDisplayErrorMessage() {
			return driver.findElement(message).isDisplayed();
			
		}
		
		public String captureErrorMessage() {
		return	driver.findElement(message).getText();
				
		}
		
		
		
		
		
		
		
		
	}
