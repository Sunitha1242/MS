package net.javaguides.employeeservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	@Column(nullable = false, unique = true)
	private String email;
	private String departmentCode;

}
