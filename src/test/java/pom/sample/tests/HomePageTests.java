package pom.sample.tests;

import org.testng.annotations.Test;

import pom.sample.base.BaseTest;
import pom.sample.screens.HomePage;

public class HomePageTests extends BaseTest {
	HomePage home;
	
	public HomePageTests() {
		home = new HomePage(driver);
	}
	
	
	
	@Test
	public void searchForAQuery() {
		home.searchForAQuery();
	}
}
