package com.go.spring.springselenium;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.go.spring.springselenium.entity.User;
import com.go.spring.springselenium.page.visa.VisaRegistrationPage;
import com.go.spring.springselenium.repository.UserRepository;


public class UserVisaTest extends SpringBaseTestNGTest {
	
	//Logger
	private static final Logger looger = LoggerFactory.getLogger(UserVisaTest.class);
	
	@Autowired
	private VisaRegistrationPage registrationPage;
	
	@Autowired
	private UserRepository repository;
	
	@Test
	public void visaTest() {
		//System.out.println(this.repository.findAll().size());
		//List<User> users = this.repository.findAll()
		//List<User> users = this.repository.findByFirstNameStartingWith("Bran")
		List<User> users = this.repository.findByDobBetween(Date.valueOf("1995-01-01"), Date.valueOf("1998-01-01"))
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
		  
		  //System.out.println(this.registrationPage.getConfirmationNumber());
		  
		  logger.info("Reques confirmation # INFO : " + this.registrationPage.getConfirmationNumber());
		  logger.warn("Reques confirmation # WARN : " + this.registrationPage.getConfirmationNumber());
		  
		  
		}
				
	}

}
