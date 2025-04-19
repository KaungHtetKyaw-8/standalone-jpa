package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void saveAllEmployees(){
        System.out.println("Saving All Employees");

        employeeDao.save(new Employee(1,"John","William","john@gmail.com","555-55-55", Date.valueOf("2020-8-05"),7000));
        employeeDao.save(new Employee(2,"John","Doe","doe@gmail.com","555-55-56", Date.valueOf("2020-8-09"),8000));
        employeeDao.save(new Employee(3,"John","Update","update0@gmail.com","555-55-57", Date.valueOf("2020-8-11"),12000));

        System.out.println("Saved All Employee");
    }

    public void listAllEmployees(){
        System.out.println("Listing All Employees...");

        employeeDao.findAll().forEach(System.out::println);
    }
}
