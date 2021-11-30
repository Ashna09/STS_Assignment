package sts.com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sts.com.qa.base.TestBase;
import sts.com.qa.pages.HomePage;
import sts.com.qa.pages.LoginPage;
import sts.com.qa.pages.RowSelection;

public class RowSelectionTest extends TestBase {

	public RowSelectionTest() throws IOException {
		super();
	}
	
	HomePage hp;
	LoginPage lp;
	RowSelection rs;
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		rs = new RowSelection();
		
		driver.get(prop.getProperty("url2"));	
	}

	@Test
	public void verifypagetitleTest() {
		Assert.assertEquals(rs.verifypagetitle(), "The Internet");
	}
	
	@Test
	public void Siblingrow() {
		Assert.assertTrue(true);

	}
	
	@Test
	public void row1() {
		Assert.assertTrue(true);

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
