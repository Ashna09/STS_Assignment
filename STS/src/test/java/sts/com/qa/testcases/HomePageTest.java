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

public class HomePageTest extends TestBase {
	public HomePageTest() throws IOException {
		super();

	}

	HomePage hp;
	LoginPage lp;
	RowSelection rs;

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		lp = new LoginPage();
		hp = lp.login(prop.getProperty("usernamecorrect"), prop.getProperty("passwordcorrect"));
	}

	@Test
	public void verifycorrectlogin() {
		Assert.assertEquals(hp.verifysigninmsg(), true);

	}

	@Test
	public void homepagetitle() {
		Assert.assertEquals(hp.verifyHomePageTitle(), "The Internet");
	}

	@Test
	public void signoutbtntest() {
		Assert.assertEquals(hp.verifysignoutbtn(), true);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
