package pom.sample.screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	@FindBy(name="q")
	private WebElement searchTextBox;
	
	@FindBy(id="result-stats")
	private WebElement resultStats;
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchForAQuery() {
		searchTextBox.sendKeys("Hello!");
		searchTextBox.sendKeys(Keys.ENTER);
		Assert.assertTrue(resultStats.isDisplayed());
	}
}
