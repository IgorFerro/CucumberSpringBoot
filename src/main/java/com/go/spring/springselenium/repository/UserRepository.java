package com.go.spring.springselenium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.go.spring.springselenium.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
