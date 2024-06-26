package com.example.CRUD.controller;

import com.example.CRUD.model.Employee;
import com.example.CRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;



    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    //building CREATE employee REST API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);

    }

//    //building GET employee by id REST API
//    @GetMapping("{id}")
//    public ResponseEntity<Employee> getEmployeebyId(@PathVariable long id) {
//
//        Employee employee = employeeRepository.findAllById(id)
//
//        return ResponseEntity.ok(employee);
//    }

    //building Update employee REST API

 
}
