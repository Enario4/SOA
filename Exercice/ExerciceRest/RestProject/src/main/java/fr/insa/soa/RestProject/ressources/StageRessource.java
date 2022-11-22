package fr.insa.soa.RestProject.ressources;

import fr.insa.soa.RestProject.Stage;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("stage")
public class StageRessource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Stage getSatge(int idEtudiant) {
		Stage stage = new Stage();
		stage.setEvaluation(16);
		stage.setCompetences("Soa, Rest");
		stage.setAnnée(2022);
		return stage;
	}
}
