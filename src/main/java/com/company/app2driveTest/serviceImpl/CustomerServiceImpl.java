package com.company.app2driveTest.serviceImpl;

import com.company.app2driveTest.dao.CustomersDao;
import com.company.app2driveTest.entity.Customers;
import com.company.app2driveTest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomersDao customersDao;

    @Override
    public void save(Customers customers) {
        customersDao.save(customers);
    }

    @Override
    public void delete(int id) {
        customersDao.deleteById(id);
    }

    @Override
    public void update(Customers customers) {
        customersDao.save(customers);
    }

    @Override
    public List<Customers> findAll() {
        return customersDao.findAll();
    }

    @Override
    public Customers findById(int id) {
        return customersDao.findById(id).get();
    }

//    @Override
//    public List<Customers> findAllByCountry(String c) {
//        return customersDao.findAllByCountry(String.valueOf(c));
//    }

    @Override
    public List<Customers> findCustomersWithAmountOfMoney() {
        return customersDao.findCustomersWithAmountOfMoney();
    }


    @Override
    public Double findAmountOfMoney(String name) {
        return customersDao.findAmountOfMoney(name);
    }
}
