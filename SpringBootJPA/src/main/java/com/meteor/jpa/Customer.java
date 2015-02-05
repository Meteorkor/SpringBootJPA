package com.meteor.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	
	protected Customer(){
		
	}
	public Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
