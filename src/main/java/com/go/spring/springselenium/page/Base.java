package com.go.spring.springselenium.page;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class Base {
	
	@Autowired
	protected WebDriver driver;
	
	@Autowired
	protected WebDriver wait;
	
	@PostConstruct
	private void init() {
		PageFactory.initElements(this.driver, this);
	}
	
	public abstract boolean isAt();

}
