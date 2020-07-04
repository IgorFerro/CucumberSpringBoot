package com.go.spring.springselenium;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.go.spring.springselenium.entity.User;
import com.go.spring.springselenium.page.visa.VisaRegistrationPage;
import com.go.spring.springselenium.repository.UserRepository;

public class UserVisaTest extends SpringBaseTestNGTest {
	
	@Autowired
	private VisaRegistrationPage registrationPage;
	
	@Autowired
	private UserRepository repository;
	
	@Test
	public void visaTest() {
		//System.out.println(this.repository.findAll().size());
		List<User> users = this.repository.findAll()
				.stream()
				.limit(3)
				.collect(Collectors.toList());
		for (User u : users) {
		  this.registrationPage.goTo();
		  this.registrationPage.setNames(u.getFirstName(), u.getLastName());
		  this.registrationPage.setCountryFromAndTo(u.getFromCountry(), u.getTo());
		  this.registrationPage.setBirthDate(u.getDob().toLocalDate());
		  this.registrationPage.setContactDetails(u.getEmail(), u.getPhone());
		  this.registrationPage.setComments(u.getComments());
		  this.registrationPage.submit();
		  
		  System.out.println(this.registrationPage.getConfirmationNumber());
		}
				
	}

}
