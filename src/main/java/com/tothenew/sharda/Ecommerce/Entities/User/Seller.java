package com.tothenew.sharda.Ecommerce.Entities.User;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Seller {
	
	@Id
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@Embedded
	private Address address;
	
	private String gst;
	
	@Column(name = "company_contact")
	private Long companyContact;
	
	@Column(name = "company_name")
	private String companyName;

	
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

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public Long getCompanyContact() {
		return companyContact;
	}

	public void setCompanyContact(Long companyContact) {
		this.companyContact = companyContact;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}