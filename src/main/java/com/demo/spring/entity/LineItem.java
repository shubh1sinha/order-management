package com.demo.spring.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class LineItem {
	@Id
    @Column(name = "ITEMID")
    private int itemId;

    @Column(name = "ITEMNAME")
    private String itemName;

    @Column(name = "ITEMPRICE")
    private double itemPrice;

    
    public LineItem() {
		// TODO Auto-generated constructor stub
	}

	public LineItem(int itemId, String itemName, double itemPrice) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	/*
	 * public Order getOrd() { return ord; }
	 * 
	 * public void setOrd(Order ord) { this.ord = ord; }
	 */

	

	

	

	
    
    


}
