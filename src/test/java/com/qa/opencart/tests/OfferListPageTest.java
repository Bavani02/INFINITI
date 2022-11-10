package com.qa.opencart.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.listeners.ExtentReportListener;
import com.qa.opencart.pages.OfferListPage;

@Listeners(ExtentReportListener.class)
public class OfferListPageTest extends BaseTest {

	private OfferListPage offerListPage;

	@BeforeTest
	public void init() {
		offerListPage = new OfferListPage(driver);

	}

	@Test
	public void offerUpload() {

		offerListPage.uploadOffer();

		System.out.println("Successfully");
	}

}
