package com.tw.apistackbase.controller;

import com.tw.apistackbase.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(path = "/")
    public ResponseEntity<List<Employee>> getAll() {
        Employee employee = new Employee(1, "NY", "Female", 18);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = new Employee(2, "NYY", "Female", 18);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        return ResponseEntity.ok(employeeList.get(id));
    }
}
