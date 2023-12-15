package com.sunitha.cg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunitha.cg.employee.entity.Employee;
import com.sunitha.cg.employee.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

//	public ResponseVO getEmployeeWithDepartment(int id) {
//		Employee employee = employeeRepository.findById(id).get();
//
//	}

	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}



	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId).orElse(null);
	}

	

}
