package com.go.spring.springselenium.page.window;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.go.spring.springselenium.page.Base;


public class PageA extends Base{
	
	@FindBy(id = "area")
	private WebElement textArea;
	
	public void addToArea(final String msg) {
		this.textArea.sendKeys(msg);
	}
	

	@Override
	public boolean isAt() {
		//return this.wait.until((d)-> this.textArea.isDisplayed());
		return true;
	}

}
