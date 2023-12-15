package com.sunitha.cg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sunitha.cg.employee.entity.Employee;
import com.sunitha.cg.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllDepartments() {
	    List<Employee> employees = employeeService.getAllEmployees();
	    if (employees.isEmpty()) {
	        return ResponseEntity.noContent().build();
	    }
	    return ResponseEntity.ok(employees);
	}
	
	@GetMapping("/{empId}")
	public Employee getDepartment(@PathVariable int empId) {
		return employeeService.getEmployee(empId);

	}

}
