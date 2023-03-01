package com.e2ehiring.bootcamp.instructor.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "instructor")
public class Instructor {
	
	private String id;
	
	private String name;
	
	private String email;
	
	private String department;
	
	private String password;
	
}
