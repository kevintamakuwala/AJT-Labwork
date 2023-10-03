package com.auth.jdbc.credentials;

public class Credentials {
	String username,password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
	}

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
 