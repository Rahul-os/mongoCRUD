package com.demo.mongoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mongoCrud.model.Employee;
import com.demo.mongoCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployeeDetails(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public void deleteEmp(int id)
	{
		employeeRepository.deleteById(id);
	}
	
	public Employee findbyName(String name) {
		//return employeeRepository.findByName(name);
		Employee obj = employeeRepository.findByName(name);
		if(obj == null)
			System.out.println("Employee with given name not found!!");
		
		return obj;
	}
}
