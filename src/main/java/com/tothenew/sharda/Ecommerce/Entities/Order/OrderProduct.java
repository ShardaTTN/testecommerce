package com.tothenew.sharda.Ecommerce.Entities.Order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity(name = "order_product")
@Table(name = "order_product")
public class OrderProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private Order order;
	
	private Integer quantity;
	
	private Double price;
}