package sts.com.qa.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import sts.com.qa.base.TestBase;
import sts.com.qa.pages.HomePage;
import sts.com.qa.pages.LoginPage;
import sts.com.qa.pages.RowSelection;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	RowSelection rs;
	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		lp = new LoginPage();
	}

	@Test
	public void loginTitleTest() {
		Assert.assertEquals(lp.verifyLoginpagetitle(), "The Internet");
	}

	@Test
	public void loginSuccessfulTest() throws IOException {
		hp = lp.login(prop.getProperty("usernamecorrect"), prop.getProperty("passwordcorrect"));
		Assert.assertEquals(hp.verifysigninmsg(), true);
	}

	@Test
	public void correctEmailwronPwdTest() {
		lp.correctEmailwrongPwd(prop.getProperty("usernamecorrect"), prop.getProperty("wrongpwd"));
		Assert.assertEquals(lp.verifyerrormsg(), "Your password is invalid!\r\n" + 
				"×");
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
