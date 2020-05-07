package com.postgres.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.jpa.model.Employee;
import com.postgres.jpa.service.JdbcTemplateService;

@RestController
public class EmployeeJdbcTemplateController {

	@Autowired
	private JdbcTemplateService service;

	@GetMapping("/v2/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		Employee employee = service.getEmployeeById(id);
		return ResponseEntity.ok().body(employee);
	}

	@GetMapping("/v2/employees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

}
