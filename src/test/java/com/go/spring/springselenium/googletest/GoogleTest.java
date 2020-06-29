package com.go.spring.springselenium.googletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go.spring.springselenium.SpringBaseTestNGTest;
import com.go.spring.springselenium.page.google.GooglePage;

public class GoogleTest extends SpringBaseTestNGTest {
	
	@Autowired
	private GooglePage googlePage;
	
	@Test
	public void googleTest() {
		this.googlePage.goTo();
		Assert.assertTrue(this.googlePage.isAt());
		
		this.googlePage.getSearchComponent().search("spring boot");
		Assert.assertTrue(this.googlePage.getSearchResult().isAt());
		Assert.assertTrue(this.googlePage.getSearchResult().getCount()>2);
	}

}
