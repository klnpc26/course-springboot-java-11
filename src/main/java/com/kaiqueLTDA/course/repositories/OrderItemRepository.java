package com.kaiqueLTDA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiqueLTDA.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
