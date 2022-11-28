package fr.insa.mas.StudentsListService.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import fr.insa.mas.StudentsListService.model.*;

@RestController
@RequestMapping("/students")
public class StudentListResource {
	
	@GetMapping("ids/{idSpeciality}")
	public StudentIDList getIDStudents(@PathVariable("idSpeciality") String speciality) {
		
		//Simulate the database using an object StudentIDList, which contains a list of integers 
		StudentIDList studentsId =new StudentIDList();
		studentsId.addStudentToList(0);
		studentsId.addStudentToList(1);
		studentsId.addStudentToList(2);
		studentsId.addStudentToList(3);
		
		return studentsId;
		
	}
	
	@GetMapping("/all/{idSpeciality}")
	public StudentIDList getStudents(@PathVariable("idSpeciality") String speciality) {
		
		//Simulate the database using an object StudentIDList, which contains a list of integers 
		StudentIDList students =new StudentIDList();
		students.addStudentToList(0);
		students.addStudentToList(1);
		students.addStudentToList(2);
		students.addStudentToList(3);
		
		//Instanciate RestTemplate for Rest calls
		RestTemplate restTemplate = new RestTemplate();
		int i = 0;
		List<Student> listStudents = new ArrayList<Student>();
		
		while(i < students.getStudentList().size()) {
			//Call the MS to get students' information.
			//The result is deserialized into StudentInfos java object
			StudentInfos etudInfos = restTemplate.getForObject("http://localhost:8082/student/"+i, StudentInfos.class);
			
			//Call the MS to get students' evaluation.
			//The result is deserialized into Evaluation java object
			Evaluation eval = restTemplate.getForObject("http://localhost:8083/evaluation/" + i, Evaluation.class);
			listStudents.add(new Student(i, etudInfos.getFirstName(),etudInfos.getLastName(),eval.getAverage()));
			i++;
		}
		
		return students;
		
	}
}
