package com.demo.mongoCrud.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.mongoCrud.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
	
	public Employee findByName(String name);

}
