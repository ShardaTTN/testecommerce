package com.tothenew.sharda.Ecommerce.Entities.User;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Customer {
	
	@Id
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@Embedded
	private Address address;
	
	private Long contact;

	
	
	//GETTERS & SETTERS
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}
}