package com.qa.opencart.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.listeners.ExtentReportListener;
import com.qa.opencart.pages.LandingPage;
import com.qa.opencart.pages.LoginPage;

@Listeners(ExtentReportListener.class)
public class LoginPageTest extends BaseTest {

	
	private LandingPage landingPage; 
	
		@BeforeTest
		public void init() {
			landingPage = new LandingPage(driver);
	
		}
		
//		@Test
//		public void login() {
//			
//			landingPage.uploadOffer();
//			
//			System.out.println("Successfully");
//		}
		
		
		
		

	

}
