package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.opencart.utils.ElementUtil;

public class OfferListPage extends ElementUtil {

	private By preBuying = By.xpath("//span[text()='Pre Buying']");
	private By newOffer = By.xpath("//button[text() ='New Offer']");
	private By uploadOffer = By.xpath("//li[text()='Upload Offer']");
	private By uploadHere = By.cssSelector("img[alt='uplaod']");
	private By uploadButton = By.xpath("//button[text()='Upload']");

//	@FindBy(xpath="//button[text() ='New Offer']")		WebElement newOffer;
//	@FindBy(xpath="//li[text()='Upload Offer']")		 WebElement uploadOffer;
//	@FindBy(css ="img[alt='uplaod']")					WebElement uploadHere;
//	@FindBy(xpath = "//button[text()='Upload']")		WebElement uploadButton;

	private WebDriver driver;

	public OfferListPage(WebDriver driver) {
		super(driver);

		this.driver = driver;

	}

	public void uploadOffer() {

		super.waitForPageLoad(10000);
		highLight(preBuying);
		super.clickWhenReady(preBuying, 3000);
		super.clickWhenReady(newOffer, 3000);
		super.doClick(uploadOffer);
		super.doClick(uploadOffer);
		super.doSendKeys(uploadHere, "");
		super.doClick(uploadButton);

	}
}
