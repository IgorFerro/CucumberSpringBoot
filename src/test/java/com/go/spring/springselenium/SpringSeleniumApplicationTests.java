package com.go.spring.springselenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

@SpringBootTest
class SpringSeleniumApplicationTests {

	/*@Test
	void contextLoads() {
		Address address = new Address();
		Salary salary = new Salary();	
	    User user = new User(address,salary);
	    user.printDetails();
	}*/
	
	@Autowired
	private User user;
	
	@Autowired Faker faker;
	
	@Test
	void contextLoads() {
		//user.printDetails();
		//Faker faker = new Faker();
		System.out.println(faker.name().firstName());
	}

}
