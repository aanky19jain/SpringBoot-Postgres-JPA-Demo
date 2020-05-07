package com.postgres.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgres.jpa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
