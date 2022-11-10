package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;


public class BaseTest {
	public static WebDriver driver;
	public Properties prop;

	public DriverFactory df;

//	public LoginPage loginPage;
//	public AccountsPage accPage;
//	public SearchResultsPage searchResPage;
//	public ProductInfoPage productInfoPage;
//	public RegisterPage regPage;

	public SoftAssert softAssert;
	public String methodName;
	

	@Parameters({ "browser" , "browserversion"})
	@BeforeTest
	public void setup(@Optional String browserName, @Optional String browserVersion, ITestContext testContext) {
		df = new DriverFactory();

		prop = df.initProp();

		if (browserName != null) {
			prop.setProperty("browser", browserName);
			prop.setProperty("browserversion", browserVersion);
			prop.setProperty("testname", testContext.getName());
		}

		driver = df.initDriver(prop);
//		loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}
	
	 
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
