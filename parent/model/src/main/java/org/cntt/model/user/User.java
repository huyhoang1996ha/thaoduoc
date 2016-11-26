package org.cntt.model.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.cntt.model.product.Product;

@Entity
@Table(name="user")
public class User  {
	
	/**
	 * 
	 */
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private int passWord;
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER)
	private List<Product>products;
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
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
