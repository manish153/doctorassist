//package com.mycompany.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//@Entity
//public class Users {
//
//	private Integer id;
//	private String username;
//	private String password;
//	private Boolean enabled;
//	private String role;
//	private String email;
//
//	public Users() {
//	}
//
//	public Users(String username, String password, Boolean isEnabled, String role, String email) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.enabled = isEnabled;
//		this.role = role;
//		this.email = email;
//	}
//
//	@Id
//	@GeneratedValue
//	/**
//	 * @return the id
//	 */
//	public Integer getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the username
//	 */
//	public String getUsername() {
//		return username;
//	}
//
//	/**
//	 * @param username the username to set
//	 */
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	/**
//	 * @return the password
//	 */
//	public String getPassword() {
//		return password;
//	}
//
//	/**
//	 * @param password the password to set
//	 */
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	/**
//	 * @return the isEnabled
//	 */
//	public Boolean getEnabled() {
//		return enabled;
//	}
//
//	/**
//	 * @param isEnabled the isEnabled to set
//	 */
//	public void setEnabled(Boolean isEnabled) {
//		this.enabled = isEnabled;
//	}
//
//	/**
//	 * @return the roles
//	 */
//	public String getRole() {
//		return role;
//	}
//
//	/**
//	 * @param roles the roles to set
//	 */
//	public void setRole(String roles) {
//		this.role = roles;
//	}
//	
//	/**
//	 * @return the emailAddress
//	 */
//	public String getEmail() {
//		return email;
//	}
//
//	/**
//	 * @param emailAddress the emailAddress to set
//	 */
//	public void setEmail(String emailAddress) {
//		this.email = emailAddress;
//	}
//}