package com.ecome.demoecome.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DemoOrder {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long orderId;

	    private String customerName;

	    private Timestamp orderDate;

	    private BigDecimal totalAmount;

	    @Enumerated(EnumType.STRING)
	    private OrderStatus orderStatus;

	    
	    
		public DemoOrder(Long orderId, String customerName, Timestamp orderDate, BigDecimal totalAmount,
				OrderStatus orderStatus) {
			super();
			this.orderId = orderId;
			this.customerName = customerName;
			this.orderDate = orderDate;
			this.totalAmount = totalAmount;
			this.orderStatus = orderStatus;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Timestamp getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Timestamp orderDate) {
			this.orderDate = orderDate;
		}

		public BigDecimal getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(BigDecimal totalAmount) {
			this.totalAmount = totalAmount;
		}

		public OrderStatus getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(OrderStatus orderStatus) {
			this.orderStatus = orderStatus;
		}

	  
	}




