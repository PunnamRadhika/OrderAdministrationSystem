package com.oas.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.oas.DTO.OrderDTO;

public interface OrderService {
	
	public abstract ResponseEntity<OrderDTO> saveOrder(OrderDTO op);
	
	public abstract ResponseEntity<OrderDTO> updateOrder(OrderDTO op);
	
	public abstract ResponseEntity<Object> deleteOrder(Integer oid);
	
	public abstract OrderDTO getByOrderId(Integer oid);
	
	public abstract List<OrderDTO> getAllOrders();


}
