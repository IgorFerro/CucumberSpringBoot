package com.go.spring.springselenium.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go.spring.springselenium.page.flights.FlightPage;

public class FlightTest {

	@Autowired
	private FlightPage flightPage;
	
	private FlightAppDetails flightAppDetails;
	
	@Test
	public void flightTest() {
		this.flightPage.goTo(this.flightAppDetails.getUrl());
		Assert.assertTrue(this.flightPage.isAt());
		
		Assert.assertEquals(this.flightPage.getLabels(), this.flightAppDetails.getLables());
		
		
	}
}
