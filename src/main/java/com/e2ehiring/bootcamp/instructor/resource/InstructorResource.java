package com.e2ehiring.bootcamp.instructor.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.e2ehiring.bootcamp.instructor.domain.Instructor;
import com.e2ehiring.bootcamp.instructor.service.InstructorService;


public class InstructorResource {
	
	private static final Logger log = LoggerFactory.getLogger(InstructorResource.class);
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/instructors")
	public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor request){
		log.debug("REST request to add new Instructor");
		Instructor instructor = instructorService.save(request);
		return ResponseEntity.ok().body(instructor);
	}

	@GetMapping("/instructors")
	public ResponseEntity<List<Instructor>> getAllInstructor(){
		List<Instructor> instructors = instructorService.findAll();
		return ResponseEntity.ok().body(instructors);
	}
	
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

}
