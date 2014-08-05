package org.wmonster.wshop.model;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import sun.security.util.Password;

@Document(collection = "users")
public class Customer {

	@Id
	@Email
	String email;
	Password password;

	public Customer(String email, String password) {
	}

	public String getEmail() {
		return email;
	}

	public Password getPassword() {
		return password;
	}

}
