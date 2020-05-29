package com.rest.crud.jpa.controller;

import com.rest.crud.jpa.entity.Employee;
import com.rest.crud.jpa.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired private EmployeeService employeeService;

  @GetMapping("/employees")
  private List<Employee> getEmployees() {
    return employeeService.getEmployees();
  }
}
