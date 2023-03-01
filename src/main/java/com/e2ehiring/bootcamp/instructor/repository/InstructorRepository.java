package com.e2ehiring.bootcamp.instructor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.e2ehiring.bootcamp.instructor.domain.Instructor;

public interface InstructorRepository extends MongoRepository<Instructor, String>{

}
