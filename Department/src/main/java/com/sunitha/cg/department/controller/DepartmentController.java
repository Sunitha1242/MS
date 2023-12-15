package com.sunitha.cg.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunitha.cg.department.entity.Department;
import com.sunitha.cg.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);

	}

	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable int id) {
		return departmentService.getDepartment(id);

	}
	
	

//	@GetMapping("/allnames")
//	public List<Department> getAllNames(){
//		return departmentService.getAllDepartmentNames();
//		
//	}
	

	@GetMapping("/getAll")
	public ResponseEntity<List<Department>> getAllDepartments() {
		List<Department> departments = departmentService.getAllDepartments();
		if (departments.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(departments);
	}
}
