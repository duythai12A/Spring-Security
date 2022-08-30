package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.entity.bill;
import com.example.springsecuritydemo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {
    @Autowired
    private BillService service;

    @PostMapping("/addBill")
    public bill addBill(@RequestBody bill bill){
        return service.saveBill(bill);
    }
    @GetMapping("/getBills")
    public List<bill> findAllStudents(){
        return service.getStudents();
    }
    @PostMapping("/allBills")
    public List<bill>addBilss(@RequestBody List<bill>bill){
        return service.saveBills(bill);
    }
    @GetMapping("/searchFilter/{minQuan}/{maxQuan}")
    public List<bill>findBillFilter(@PathVariable(value = "minQuan")int minQuan,@PathVariable(value = "maxQuan")int maxQuan){
        return service.searchFilter(minQuan,maxQuan);
    }
    @GetMapping("/bill/{id}")
    public bill findById(@PathVariable(name = "id") int id){
        return service.getBillById(id);
    }
    @PutMapping("/update")
    public bill updateBill(@RequestBody bill bill){
       return service.updateBill(bill);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBill(@PathVariable(value = "id") int id){
        return service.deleteBill(id);
    }


}
