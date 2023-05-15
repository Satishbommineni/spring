package com.satish.employeeapp.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.satish.employeeapp.employeeservice.entity.Employee;
import com.satish.employeeapp.employeeservice.repo.EmployeeRepo;
@RestController
public class EmployeeController {
    
	private Employee EmployeeRepo;
	
	
	@GetMapping("/employees/{id}")
	Employee getEmployeeDetails(@PathVariable("id") int id){
	 //db call -> employee 1
		Employee employee = EmployeeRepo.findById(id).get();
		return employee;
 }
}
