package com.alok.bindings;

public class User {
	private Integer uid;
	private String name;
	private String email;
	private Long phone;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	

}
