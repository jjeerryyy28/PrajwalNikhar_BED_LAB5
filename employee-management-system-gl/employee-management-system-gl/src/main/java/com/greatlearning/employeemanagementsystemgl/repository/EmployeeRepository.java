package com.greatlearning.employeemanagementsystemgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagementsystemgl.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
