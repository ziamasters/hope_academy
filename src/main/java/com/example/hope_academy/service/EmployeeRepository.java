package com.example.hope_academy.service;

import com.example.hope_academy.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepository extends JpaRepository<Employee, String> {

}
