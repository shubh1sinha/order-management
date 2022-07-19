package com.demo.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@Column(name = "ORDERID")
	private int OrderId;

	@Column(name = "CUSTOMERNAME")
	private String customerName;

	@JsonIgnoreProperties("order")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESSID")
	private ShippingAddress address;

	// @Column(name = "ITID")
	// private int itemid;

	@JsonIgnoreProperties("ord")
	@OneToMany(cascade = CascadeType.ALL)
	// @ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "ORDERID")
	private List<LineItem> items;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String customerName) {
		this.OrderId = orderId;
		this.customerName = customerName;

	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ShippingAddress getAddress() {
		return address;
	}

	public void setAddress(ShippingAddress address) {
		this.address = address;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

}
