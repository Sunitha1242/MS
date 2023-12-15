package com.sunitha.cg.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Emp_details")
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String address;
	private int departmentId;
}
