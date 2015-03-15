package org.wmonster.wshop.model;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class Customer {

	@Id
	@Email
	String email;
	String password;

	public Customer(String email, String password) {
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
