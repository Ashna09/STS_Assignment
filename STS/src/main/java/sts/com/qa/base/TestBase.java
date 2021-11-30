package sts.com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

import sts.com.qa.util.ExcelUtils;

public class TestBase {
	
		public static WebDriver driver;
		public static Properties prop;
		
		public TestBase() throws IOException {
			
			
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:\\Users\\kinja\\OneDrive\\Desktop\\SeleniumWorkplace\\STS\\src\\main\\java\\sts\\com\\qa\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void initialization() throws IOException {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kinja\\OneDrive\\Desktop\\SeleniumWorkplace\\chromedriver.exe");
				
				 driver = new ChromeDriver();
			}
			else if (browserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\kinja\\OneDrive\\Desktop\\SeleniumJar\\geckodriver.exe");
				
				 driver = new FirefoxDriver();
				 
			}
			
			driver.manage().timeouts().pageLoadTimeout(ExcelUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(ExcelUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
			
		}


}
