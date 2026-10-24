package com.example.hope_academy.controller;

import com.example.hope_academy.entity.Employee;
import com.example.hope_academy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @PostMapping("/emp/save")
    public void save(@RequestBody Employee e){

        es.save(e);
    }
    @GetMapping("/getEmpList")
    public List<Employee> getData()
    {
        return es.getAllData();
    }
    @PutMapping("/emp/update/{empName}")
    public void update(@PathVariable String empName, @RequestBody Employee emp){
     //   emp.setEmpId(emp);
        es.update(emp);
    }
    @DeleteMapping("/deleteEmp")
    public void deleteEmp(@RequestBody  Employee emp){
        es.delete(emp);

    }


}
