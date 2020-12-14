package com.kaiqueLTDA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiqueLTDA.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
