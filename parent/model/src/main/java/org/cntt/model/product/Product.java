package org.cntt.model.product;



import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.cntt.model.supplier.Supplier;
import org.cntt.model.user.User;

@Entity
@Table(name="product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	@Column(name="number")
	private int number;
	@Column(name="status")
	private String status;
	@Column(name="orderday")
	private Date orderDay;
	@Column(name="assignday")
	private Date assignDay;
	@Column(name="receiveday")
	private Date receiveDay;
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="pro_sup",joinColumns={@JoinColumn(name="id_pro")},inverseJoinColumns={@JoinColumn(name="id_sup")})
	private Set<Supplier>suppliers;
	public Set<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public Product(int id, int number, String status, Date orderDay, Date assignDay, Date receiveDay) {
		super();
		this.id = id;
		this.number = number;
		this.status = status;
		this.orderDay = orderDay;
		this.assignDay = assignDay;
		this.receiveDay = receiveDay;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(Date orderDay) {
		this.orderDay = orderDay;
	}
	public Date getAssignDay() {
		return assignDay;
	}
	public void setAssignDay(Date assignDay) {
		this.assignDay = assignDay;
	}
	public Date getReceiveDay() {
		return receiveDay;
	}
	public void setReceiveDay(Date receiveDay) {
		this.receiveDay = receiveDay;
	}
	
}
