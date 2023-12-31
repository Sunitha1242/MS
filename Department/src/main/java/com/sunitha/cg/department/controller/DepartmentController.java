package com.sunitha.cg.department.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunitha.cg.department.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {

	DepartmentService departmentService;

	// Build save Department Rest API
	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
		DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);

		return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);

	}

	// Build find by id from Department
//	@GetMapping({id})
//	public ResponseEntity<DepartmentDto> findByID(@PathVariable Long id) {
//		DepartmentDto findByIdValue = departmentService.findByDepartmentId(id);
//
//		return new ResponseEntity<>(findByIdValue, HttpStatus.CREATED);
//
//	}

	// Build get department Rest API
	@GetMapping("{department_code}")
	public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department_code") String departmentCode) {
		DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
		return new ResponseEntity<>(departmentDto, HttpStatus.OK);
	}
}
