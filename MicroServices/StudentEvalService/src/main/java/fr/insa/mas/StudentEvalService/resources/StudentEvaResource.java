package fr.insa.mas.StudentEvalService.resources;

	import java.util.Arrays;
	import java.util.List;
	
	import org.springframework.web.bind.annotation.*;
	
	import fr.insa.mas.StudentEvalService.model.Evaluation;
	
	@RestController
	@RequestMapping("/evaluation")
	public class StudentEvaResource {
		
		@GetMapping("/{idStudent}")
		public Evaluation getStudentEval(@PathVariable("idStudent")int idEtud) {
			
			//simulate the database with a list that contains the marks of 4 students whose id are 0,1,2,3
			List<Evaluation> evalList=Arrays.asList(
									new Evaluation(0,13F),
									new Evaluation(1,10.65F),
									new Evaluation(2,18F),
									new Evaluation(3,18F)
									);
			
			//Return the evaluation of the specified idStudent
			return evalList.get(idEtud);
		}
}
