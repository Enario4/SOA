package fr.insa.mas.studentManagementMS.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentManagementMS.model.Student;

@RestController
public class studentResource {
	
	@GetMapping("/students")
	public int studentNumber() {
		return 200;
	}
	
	@GetMapping(value="/students/{id}")
	public Student infosStudent(@PathVariable int id) {
		Student student = new Student(id, "Rosa", "Parks");
		return student;
	}
	
	@GetMapping(value = "/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	public Student smlInofsStudent(@PathVariable int id) {
		Student student = new Student(id, "Rosa", "Parks");
		return student;
	}
	
}
