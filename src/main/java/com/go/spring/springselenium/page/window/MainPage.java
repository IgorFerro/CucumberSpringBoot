package com.go.spring.springselenium.page.window;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.go.spring.springselenium.page.Base;


  public class MainPage extends Base{
	  
	@FindBy(tagName = "a")
	private List<WebElement> links;
	
	public void goTo() {
		this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/window/main.html");
	}
	
	public void launchAllWindows() {
		for (int i =0; i<links.size(); i++) {
			links.get(i).click();
		}
	}
	  
	  
	@Override
	public boolean isAt() {
		//return this.wait.until((d)-> !this.links.isEmpty());
		return true;
	}

}
