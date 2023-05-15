package com.satish.employeeapp.employeeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satish.employeeapp.employeeservice.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
