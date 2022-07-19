package com.demo.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.OrderRepository;
import com.demo.spring.entity.LineItem;
import com.demo.spring.entity.Order;
import com.demo.spring.entity.ShippingAddress;


@RestController
public class OrderRestController {
	
	@Autowired
	OrderRepository repo;
	
	@PutMapping(value="/save")
	public ResponseEntity<String> saveOrder(){
		ShippingAddress sa= new ShippingAddress(105,"B-67","Jaipur","233334");
		List<LineItem> li= new ArrayList<>();
		li.add(new LineItem(105,"Pen",10));
		li.add(new LineItem(106,"Earphone",300));
		Order o= new Order(5,"Shubham");
		
		o.setAddress(sa);
		o.setItems(li);
		repo.save(o);
		return ResponseEntity.ok("{\"status\":\"Orders and Address Saved Successfully.\"}");
	}
	
	@GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Order> findAllOrders() {
		List<Order> orderList = repo.findAll();
		return orderList;

	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleError(Exception ex){
		return ResponseEntity.status(404).body(ex.getMessage());
		
	}


}
