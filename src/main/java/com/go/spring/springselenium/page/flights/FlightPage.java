package com.go.spring.springselenium.page.flights;

import java.util.List;
import java.util.stream.Collectors;

import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.go.spring.springselenium.page.Base;

public class FlightPage extends Base {
	
	@FindBy(css="a.gws-travel-header__nav-item span.gws-travel-header__nav-label")
	private List<WebElement> elements;
	
	public void goTo(final String url) {
		this.driver.get(url);
	}
	
	public List<String>getLabels(){
		return this.elements
				.stream()
		        .map(WebElement::getText) 
		        .map(String::trim)
		        .collect(Collectors.toList());
		
	}

	@Override
	public boolean isAt() {
		return true;
		//return this.wait.until((d)-> !this.elements.isEmpty());
	}

}
