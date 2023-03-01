package com.e2ehiring.bootcamp.instructor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e2ehiring.bootcamp.instructor.domain.Instructor;
import com.e2ehiring.bootcamp.instructor.repository.InstructorRepository;
import com.e2ehiring.bootcamp.instructor.service.InstructorService;

@Service
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	private InstructorRepository instructorRepository;

	@Override
	public Instructor save(Instructor request) {
		Instructor result = instructorRepository.save(request);
		return result;
	}

	@Override
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}

	@Override
	public Optional<Instructor> findById(String id) {
		return instructorRepository.findById(id);
	}

	@Override
	public String deleteById(String id) {
		instructorRepository.deleteById(id);
		return "success";
	}

}
