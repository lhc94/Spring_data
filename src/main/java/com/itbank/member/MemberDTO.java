package com.itbank.member;

// LOMBOK : getter/setter/contructor/toString
public class MemberDTO {
	
	private String userid, userpw, username, email, gender;
	
	@Override
	public String toString() {
		return String.format("{%s, %s, %s, %s, %s}", userid, userpw, username, email, gender);
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
