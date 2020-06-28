package com.go.spring.springselenium.page.google;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.go.spring.springselenium.page.Base;

public class SearchComponent extends Base {
	
	@FindBy(name = "q")
	private WebElement searchBox;
	
	@FindBy(name = "btnK")
	private List<WebElement> searchBtns;
	
	public void search(final String keyword) {
		this.searchBox.sendKeys(keyword);
		this.searchBox.sendKeys(Keys.TAB);
		this.searchBtns
		       .stream()
		       .filter(e -> e.isDisplayed() && e.isEnabled())
		       .findFirst()
		       .ifPresent(WebElement::click);
	}

	@Override
	public boolean isAt() {
		return false;
	}

}
