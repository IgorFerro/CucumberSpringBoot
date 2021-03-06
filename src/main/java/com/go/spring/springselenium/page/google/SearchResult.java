package com.go.spring.springselenium.page.google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;
import org.openqa.selenium.WebDriver.*;

import com.go.spring.springselenium.page.Base;

@Component
public class SearchResult extends Base {
	
	@FindBy(css = "div.rc")
	private List<WebElement>results;
	
	
	public int getCount(){
		return this.results.size();
	}

	@Override
	public boolean isAt() {
		return true;
		//return this.wait.until((d)-> this.results.isEmpty());
	}

}
