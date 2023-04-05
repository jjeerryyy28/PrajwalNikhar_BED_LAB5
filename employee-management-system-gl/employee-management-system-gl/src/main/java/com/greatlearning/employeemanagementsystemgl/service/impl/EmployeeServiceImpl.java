package com.greatlearning.employeemanagementsystemgl.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagementsystemgl.entity.Employee;
import com.greatlearning.employeemanagementsystemgl.repository.EmployeeRepository;
import com.greatlearning.employeemanagementsystemgl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;
  
  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }
  
  @Override
  public Optional<Employee> getEmployeeById(Long id) {
    return employeeRepository.findById(id);
  }
  
  @Override
  public void saveEmployee(Employee employee) {
    employeeRepository.save(employee);
  }
  
  @Override
  public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
  }
}