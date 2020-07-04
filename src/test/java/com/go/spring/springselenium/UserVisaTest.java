package com.go.spring.springselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.go.spring.springselenium.repository.UserRepository;

public class UserVisaTest extends SpringBaseTestNGTest {
	
	@Autowired
	
	private UserRepository repository;
	
	@Test
	public void visaTest() {
		System.out.println(this.repository.findAll().size());
	}

}
