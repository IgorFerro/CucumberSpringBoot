package com.go.spring.springselenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${street}")
	private String street;
	
	
	/*public Address() {
		this.street = "Rua 10";
	}*/

	public String getStreet() {
		return street;
	}
}
