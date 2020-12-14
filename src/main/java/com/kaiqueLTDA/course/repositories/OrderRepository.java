package com.kaiqueLTDA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiqueLTDA.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
