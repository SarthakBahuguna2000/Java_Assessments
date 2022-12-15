package com.bhavna.bean;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	@Id
	private int orderId;
	
	private String orderCategory;
	private Date orderDate;
	//private Date deliveryDate;
	private String status;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderCategory=" + orderCategory + ", orderDate=" + orderDate
				+ ", status=" + status + "]";
	}
	public Orders() {
		super();
	}
	public Orders(int orderId, String orderCategory, Date orderDate, String status) {
		super();
		this.orderId = orderId;
		this.orderCategory = orderCategory;
		this.orderDate = orderDate;
		this.status = status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}