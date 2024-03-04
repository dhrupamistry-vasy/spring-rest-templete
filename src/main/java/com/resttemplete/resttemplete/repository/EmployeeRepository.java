package com.resttemplete.resttemplete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resttemplete.resttemplete.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}