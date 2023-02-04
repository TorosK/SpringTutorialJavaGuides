package com.example.springtutorialjavaguides.service;

import com.example.springtutorialjavaguides.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(long id);
    Employee updateEmployee(Employee employee, long id);
}
