package com.neuedu.model;

public class User {
private Integer userid;
private String username;
private String password;
private String phone;
private String email;
public User() {

}
public User(Integer userid, String username, String password, String phone, String email) {
	super();
	this.userid = userid;
	this.username = username;
	this.password = password;
	this.phone = phone;
	this.email = email;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", phone=" + phone
			+ ", email=" + email + "]";
}
}
