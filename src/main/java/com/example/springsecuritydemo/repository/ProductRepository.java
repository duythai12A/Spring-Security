package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product,Integer> {
}
