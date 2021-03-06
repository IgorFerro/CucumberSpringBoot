package com.go.spring.springselenium.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.go.spring.springselenium.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByFirstNameStartingWith(String startsWith);
	List<User> findByDobBetween(Date from, Date to);
}
