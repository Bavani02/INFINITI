package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(xpath="//span[text()='Pre Buying']")		WebElement preBuying;
	@FindBy(className="new-offer-btn")					WebElement newOffer;
	@FindBy(xpath="//li[text()='Upload Offer']")		 WebElement uploadOffer;
	@FindBy(css ="img[alt='uplaod']")					WebElement uploadHere;
	@FindBy(xpath = "//button[text()='Upload']")		WebElement uploadButton;
	
	private WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	}

	
		
		
		
	


