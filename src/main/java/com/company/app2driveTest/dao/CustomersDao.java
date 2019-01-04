package com.company.app2driveTest.dao;

import com.company.app2driveTest.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomersDao extends JpaRepository<Customers, Integer> {

//    List<Customers> findAllByCountry(String c);

    @Query("select distinct  p.customerNumber, c.customerName, SUM(p.amount) from Customers c inner join Payments p on c.customerNumber = p.customerNumber group by p.customerNumber")
    List<Customers> findCustomersWithAmountOfMoney();

    @Query("select SUM(p.amount) from Customers c inner join Payments p on c.customerNumber = p.customerNumber where c.customerName=:name")
    Double findAmountOfMoney(@Param("name") String name);

//    SELECT SUM(amount)
//    FROM customers AS c
//    INNER JOIN payments AS p ON
//    p.customerNumber = c.customerNumber
//    WHERE c.customerName = 'Signal Gift Stores';


}
