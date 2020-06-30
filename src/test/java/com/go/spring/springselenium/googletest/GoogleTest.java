package com.go.spring.springselenium.googletest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go.spring.springselenium.SpringBaseTestNGTest;
import com.go.spring.springselenium.page.google.GooglePage;
import com.go.spring.springselenium.util.ScreenShotUtil;

public class GoogleTest extends SpringBaseTestNGTest {
	
	@Autowired
	private GooglePage googlePage;
	
	
	private ScreenShotUtil screenShotUtil;
	
	@Test
	public void googleTest() throws IOException {
		this.googlePage.goTo();
		Assert.assertTrue(this.googlePage.isAt());
		
		this.googlePage.getSearchComponent().search("spring boot");
		Assert.assertTrue(this.googlePage.getSearchResult().isAt());
		Assert.assertTrue(this.googlePage.getSearchResult().getCount()>2);
		//this.screenShotUtil.takesScreenShot("Teste");
	}

}
