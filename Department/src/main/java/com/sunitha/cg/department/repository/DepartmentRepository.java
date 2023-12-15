package com.sunitha.cg.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunitha.cg.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
