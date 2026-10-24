package com.example.hope_academy.service;

import com.example.hope_academy.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    public void save(Employee e) {

      //  Employee zia = new Employee("23456", "zia" , "java" , 100000.24, "9876543", "456789");
       // Employee anas = new Employee("12345" , "anas" , "java" , 100000.23, "970017865" , "908723");
        er.save(e);
       // er.save(anas);

    }
    public List<Employee> getAllData(){
        return er.findAll();

    }
    public void update(Employee employee){
        er.save(employee);

    }
    public void delete(Employee employee){
        er.delete(employee);
    }

}
