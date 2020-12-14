package com.kaiqueLTDA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiqueLTDA.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
