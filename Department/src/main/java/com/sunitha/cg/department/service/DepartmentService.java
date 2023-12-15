package com.sunitha.cg.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunitha.cg.department.entity.Department;
import com.sunitha.cg.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department addDepartment(Department department) {
		return departmentRepository.save(department);

	}

	public Department getDepartment(int id) {

		return departmentRepository.findById(id).orElse(null);
	}

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	

	
}
