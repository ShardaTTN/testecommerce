package com.tothenew.sharda.Ecommerce.Entities.User;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity(name = "user_role")
@Table(name = "user_role")
public class UserRole {
	
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;

	
	//GETTERS & SETTERS
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}