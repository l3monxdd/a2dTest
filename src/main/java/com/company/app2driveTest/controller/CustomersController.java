package com.company.app2driveTest.controller;

import com.company.app2driveTest.entity.Customers;
import com.company.app2driveTest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/all")
    public List<Customers> getAllCustomers() {
        return customerService.findAll();
    }

//    @GetMapping("/findAllByCountry/{country}")
//    public List<Customers> findAllByCountry(@PathVariable String country){
//        return customerService.findAllByCountry(country);
//    }

    @GetMapping("/amount")
    public List<Customers> findCustomersWithAmountOfMoney() {
        return customerService.findCustomersWithAmountOfMoney();
    }

    @PostMapping("/amount")
    public Double findAmountOfMoney(@RequestBody Customers customers) {
        String name = customers.getCustomerName();
        System.out.println(name);
        return customerService.findAmountOfMoney(name);
    }


}
