package com.e2ehiring.bootcamp.instructor.service;

import java.util.List;
import java.util.Optional;

import com.e2ehiring.bootcamp.instructor.domain.Instructor;


public interface InstructorService {

	Instructor save(Instructor request);
	
	List<Instructor> findAll();
	
	Optional<Instructor> findById(String id);
	
	String deleteById(String id);

}
