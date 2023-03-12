package com.demo.mongoCrud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Document
public class Employee {

		private int id;
		private String name;
		private String address;
}
