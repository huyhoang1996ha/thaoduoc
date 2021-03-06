package org.cntt.model.supplier;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.cntt.model.product.Product;

@Entity
@Table(name="supplier")
public class Supplier  {

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", price=" + price + ", products=" + products + "]";
	}
	/**
	 * 
	 */
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private String price;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="pro_sup",joinColumns=@JoinColumn(name="id_sup"),inverseJoinColumns=@JoinColumn(name="id_pro"))
	private Set<Product>products;
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Supplier(int id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
}
