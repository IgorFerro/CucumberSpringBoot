package com.go.spring.springselenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import io.github.bonigarcia.wdm.WebDriverManager;

@Lazy
@Configuration
@Profile("remote")
public class WebDriverConfig {
	
	
	
	@Bean
	@ConditionalOnProperty(name="browser",havingValue = "chrome")
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("83.0.4103.39").setup();
		return new ChromeDriver();
	}
	
	@Bean
	@ConditionalOnProperty(name="browser",havingValue = "firefox")
	public WebDriver firefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
	
	

}
