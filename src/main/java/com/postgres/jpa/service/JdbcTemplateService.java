package com.postgres.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.jpa.model.Employee;
import com.postgres.jpa.repository.JdbcTemplateRepository;

@Service
public class JdbcTemplateService {

	@Autowired
	private JdbcTemplateRepository repository;

	public Employee getEmployeeById(long id) {
		String sql = "SELECT first_name, last_name, email FROM employee WHERE id = ?";
		return repository.queryForObject(sql, new Object[] { id }, Employee.class);
	}

	public List<Employee> getAllEmployees() {
		String sql = "SELECT first_name, last_name, email FROM employee";
		return repository.query(sql, Employee.class);
	}

}
