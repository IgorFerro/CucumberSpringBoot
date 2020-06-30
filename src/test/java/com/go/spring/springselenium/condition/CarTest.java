package com.go.spring.springselenium.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import com.go.spring.springselenium.SpringBaseTestNGTest;

public class CarTest extends SpringBaseTestNGTest {

	@Qualifier("accord")
	@Autowired
	private Car car;
	
	@Test
	public void carTest() {
		this.car.run();
	}
	
}
