package sts.com.qa.pages;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sts.com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//i[contains (text(),'Login')]")
	WebElement signinbtn;

	@FindBy(id = "flash")
	WebElement errormsg;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginpagetitle() {
		return driver.getTitle();
	}

	public HomePage login(String us, String pwd) throws IOException {
		username.sendKeys(us);
		password.sendKeys(pwd);
		signinbtn.click();
		return new HomePage();
	}

	/*	public void loginwithIncorrectData(String us, String pwd) {
		username.sendKeys(us);
		password.sendKeys(pwd);
		signinbtn.click();
	}*/

	public void correctEmailwrongPwd(String us, String pwd) {
		username.sendKeys(us);
		password.sendKeys(pwd);
		signinbtn.click();
	}

	public String verifyerrormsg() {
		return errormsg.getText();

	}

	
	
}

