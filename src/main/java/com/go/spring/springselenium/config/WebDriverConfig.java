package com.go.spring.springselenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {
	
	@Value("${default.timeout:30}")
	private int timeout;
	
	@Bean
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("83.0.4103.39");
		return new ChromeDriver();
	}
	
	@Bean
	public WebDriverWait webdriverWait(WebDriver driver) {
		return new WebDriverWait(driver, this.timeout);
	}
	
	

}
