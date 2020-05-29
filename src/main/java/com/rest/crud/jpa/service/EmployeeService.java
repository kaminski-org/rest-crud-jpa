package com.rest.crud.jpa.service;

import com.rest.crud.jpa.entity.Employee;
import com.rest.crud.jpa.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  @Autowired private EmployeeRepository employeeRepository;

  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }
}
