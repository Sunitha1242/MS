
package com.sunitha.cg.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dept_details")
public class Department {
	
	@Id
	@GeneratedValue
	private int departmentId;
	private String departmentName;
	
	
	
	
	
	
	

}
