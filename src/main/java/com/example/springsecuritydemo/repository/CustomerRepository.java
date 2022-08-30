package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee,Integer> {
}
