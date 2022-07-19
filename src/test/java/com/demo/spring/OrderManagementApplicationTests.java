package com.demo.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.demo.spring.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = OrderManagementApplication.class)
class OrderManagementApplicationTests {
	
	@MockBean
	OrderRepository repo;
	
	@Test
	@Order(1)
	public void shouldReturnAllOrders() throws Exception{
		
		List<com.demo.spring.entity.Order> ordList = repo.findAll();
		assertEquals(ordList.size(), 0);
	}

}
