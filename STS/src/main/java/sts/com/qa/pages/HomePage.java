package sts.com.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sts.com.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath = "//div[contains(text(),' You logged into a secure area!')]")
WebElement signinmsg;

@FindBy(xpath="//i[contains(text(),' Logout')]")
WebElement signoutbtn;
	
	
	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifysigninmsg(){
		return signinmsg.isDisplayed();
	}
	
	public boolean verifysignoutbtn(){
		return signoutbtn.isDisplayed();
	}

}
