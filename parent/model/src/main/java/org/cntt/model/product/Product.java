package org.cntt.model.product;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

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
