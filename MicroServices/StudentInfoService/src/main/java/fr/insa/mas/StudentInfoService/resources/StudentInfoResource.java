package fr.insa.mas.StudentInfoService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import fr.insa.mas.StudentInfoService.model.StudentInfos;

@RestController
@RequestMapping("/student")
public class StudentInfoResource {
	
	@GetMapping("/{idStudent}")
	public StudentInfos getInfosEtudiant(@PathVariable("idStudent") int id) {
		//Simulate the database with a list
		List<StudentInfos> etudInfos=Arrays.asList(
				new StudentInfos(0, "Godart", "Noémie","12/12/1992"),
				new StudentInfos(1, "Perrin", "Ania","10/02/1993"),
				new StudentInfos(2, "Azi", "Sana","22/05/1992"),
				new StudentInfos(3, "Yala", "Nelia","12/06/1994")
				);
		
		System.out.println("Called !");
		//Get the student that corresponds to the id
		return etudInfos.get(id);
	}
}
