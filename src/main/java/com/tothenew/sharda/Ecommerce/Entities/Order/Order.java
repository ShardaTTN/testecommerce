package com.tothenew.sharda.Ecommerce.Entities.Order;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import com.tothenew.sharda.Ecommerce.Entities.User.Customer;



@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@JoinColumn(name = "customer_user_id", referencedColumnName = "id")
	private Customer customer;
	
	@Column(name = "amount_paid")
	private Double amountPaid;
	
	@Column(name = "date_created")
	private LocalDate dateCreated;
	
	@Column(name = "payment_method")
	private String paymentMethod;
}