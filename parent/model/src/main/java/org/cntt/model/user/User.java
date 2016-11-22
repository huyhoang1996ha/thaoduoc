package org.cntt.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private int passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	public User(String userName, int passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
}