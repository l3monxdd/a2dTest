package com.company.app2driveTest.service;

import com.company.app2driveTest.entity.Customers;

import java.util.List;

public interface CustomerService {

    void save(Customers customers);

    void delete(int id);

    void update(Customers customers);

    List<Customers> findAll();

    Customers findById(int id);

//    List<Customers> findAllByCountry(String c);

    List<Customers> findCustomersWithAmountOfMoney();

    Double findAmountOfMoney(String name);
}
