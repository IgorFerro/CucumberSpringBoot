package com.go.spring.springselenium;

public class User {
	
	private Address address;
	private Salary salary;
	
	
	public User(Address address, Salary salary) {
		super();
		this.address = address;
		this.salary = salary;
	}
	
	 public void printDetails() {
	      System.out.println("Address : " + this.address.getStreet());
	      System.out.println("Salary : " + this.salary.getAmount());
	 }
}
