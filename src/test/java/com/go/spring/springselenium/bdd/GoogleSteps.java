package com.go.spring.springselenium.bdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import com.go.spring.springselenium.page.google.GooglePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest
public class GoogleSteps {
	
	@Autowired
	private GooglePage googlePage;
	
	
	@Given("I am on the google site")
	public void launchSite() {
	  this.googlePage.goTo();
	  
	}

	@When("I enter {string} as a keyword")
	public void enterKeyword(String keyword) {
	  this.googlePage.getSearchComponent().search(keyword);
	}

	@When("I click on the search button")
	public void clickSearch() {
	    Assert.assertTrue(this.googlePage.getSearchResult().isAt());
	}

	@Then("I should see al least {int} results")
	public void verifyResults(int count) {
	   Assert.assertTrue(this.googlePage.getSearchResult().getCount() >= count);

 }
}
