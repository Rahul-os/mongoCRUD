package com.demo.mongoCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mongoCrud.model.Employee;
import com.demo.mongoCrud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController { 
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp)
	{
		
		return new ResponseEntity<Employee>(employeeService.saveEmployee(emp),HttpStatus.OK);
	}
	
	@GetMapping("/allemp")
	public ResponseEntity<List<Employee>> getEmployees()
	{
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp)
	{
		return new ResponseEntity<Employee>(employeeService.updateEmployeeDetails(emp),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id)
	{
		employeeService.deleteEmp(id);
		return new ResponseEntity<String>("employee deleted!",HttpStatus.OK); 
	}
	
	@GetMapping("empname/{empname}")
	public ResponseEntity<Employee> findbyName(@PathVariable("empname") String name)
	{
		return new ResponseEntity<Employee>(employeeService.findbyName(name),HttpStatus.OK);
	}
}
