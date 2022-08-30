package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Integer> {
}
