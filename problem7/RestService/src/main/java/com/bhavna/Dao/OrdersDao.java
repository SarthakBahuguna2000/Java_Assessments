package com.bhavna.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.bean.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer>{

	Orders findByOrderCategory(String categoryName);
	
}
