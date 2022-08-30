package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.entity.account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<account,String> {

    account findByUserName(String username);
}
