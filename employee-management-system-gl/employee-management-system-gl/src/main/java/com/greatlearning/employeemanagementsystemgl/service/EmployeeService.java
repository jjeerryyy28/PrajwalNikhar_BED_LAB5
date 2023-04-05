package com.greatlearning.employeemanagementsystemgl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagementsystemgl.entity.Employee;

@Service
public interface EmployeeService {
  List<Employee> getAllEmployees();
  
  Optional<Employee> getEmployeeById(Long id);
  
  void saveEmployee(Employee employee);
  
  void deleteEmployee(Long id);
}
