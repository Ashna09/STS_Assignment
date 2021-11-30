package sts.com.qa.pages;

import java.io.IOException;

import javax.swing.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sts.com.qa.base.TestBase;

public class RowSelection extends TestBase {
	
	public RowSelection() throws IOException {
		super();
		
		
		driver.get(prop.getProperty("url2"));
		
	}
	
	@FindBy(xpath = "//div[contains(text(),Siblings)]//h4[2]")
	WebElement siblings;
	
	@FindBy(xpath= "//div[@id='sibling-1.3']")
	WebElement row1;
	
	@FindBy(xpath= "//div[@id='sibling-13.2']")
	WebElement row2;
	
	
	public String verifypagetitle() {
		return driver.getTitle();
	}
	
	public void Siblingrow() {
		siblings.click();
	}
	
	public void Row1() {
		row1.click();
	}
	
	public void Row2() {
		row2.click();
	}
	
	//public boolean Siblingrow() {
		//return siblings.isSelected();
		
//	}
	
//	public boolean Row1Sel() {
		//return row1.isSelected();
	//}
	
	
	

}
