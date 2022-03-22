package com.tothenew.sharda.Ecommerce.Entities.User;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	private String email;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String password;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "is_expired")
	private Boolean isExpired;
	
	@Column(name = "is_locked")
	private Boolean isLocked;
	
	@Column(name = "invalid_attempt_count")
	private Integer invalidAttemptCount;
	
	@Column(name = "password_update_date")
	private LocalDate passwordUpdateDate;

	
	//GETTERS & SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Integer getInvalidAttemptCount() {
		return invalidAttemptCount;
	}

	public void setInvalidAttemptCount(Integer invalidAttemptCount) {
		this.invalidAttemptCount = invalidAttemptCount;
	}

	public LocalDate getPasswordUpdateDate() {
		return passwordUpdateDate;
	}

	public void setPasswordUpdateDate(LocalDate passwordUpdateDate) {
		this.passwordUpdateDate = passwordUpdateDate;
	}
}