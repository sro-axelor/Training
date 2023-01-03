package com.axelor.action.service;

import javax.validation.ValidationException;

import com.axelor.action.db.Order;

public class OrderService {

	public void validate(Order order) {
	    if (order != null
	        && order.getDeliveryDate() != null
	        && order.getDeliveryDate().isBefore(order.getOrderDate())) {
	      throw new ValidationException("Invalid sale order, confirm date is before order date.");
	    }
	  }
}
	 
