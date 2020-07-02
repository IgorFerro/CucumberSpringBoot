package com.go.spring.springselenium.window;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.go.spring.springselenium.SpringBaseTestNGTest;
import com.go.spring.springselenium.page.window.MainPage;
import com.go.spring.springselenium.page.window.PageA;
import com.go.spring.springselenium.page.window.PageB;
import com.go.spring.springselenium.page.window.PageC;
import com.go.spring.springselenium.service.WindowsSwitchService;

@TestPropertySource(properties= "browser=firefox")
public class WindowSwitchTest extends SpringBaseTestNGTest {
	
   
	WindowsSwitchService s = new WindowsSwitchService();
			
	
	@Autowired
	private MainPage mainPage;
	
	@Autowired
	private PageA pageA;
	
	@Autowired
	private PageB pageB;
	
	//@Autowired
	//private WindowSwitchTest switchService;
	
	@BeforeClass
	public void setup() {
		this.mainPage.goTo();
		this.mainPage.isAt();
		this.mainPage.launchAllWindows();
			
	}
	
	@Test
	public void switchTest() {
		this.s.switchByTitle("Page A");
		this.pageA.addToArea("Hi Page A");
		this.s.switchByIndex(2);
		this.pageA.addToArea("Hello Page B");

	}
	
	

}
