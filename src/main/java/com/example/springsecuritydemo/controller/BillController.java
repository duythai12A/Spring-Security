package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.entity.bill;
import com.example.springsecuritydemo.repository.BillRepository;
import com.example.springsecuritydemo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private BillService service;

    @PostMapping("/addBill")
    public bill addBill(@RequestBody bill bill){
        return service.saveBill(bill);
    }
}
