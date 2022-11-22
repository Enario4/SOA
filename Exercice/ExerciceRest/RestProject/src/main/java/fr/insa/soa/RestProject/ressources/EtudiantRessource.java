package fr.insa.soa.RestProject.ressources;

import fr.insa.soa.RestProject.Etudiant;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("etudiant")
public class EtudiantRessource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant(@Context UriInfo uriInfo) {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("N");
		etudiant.setPrenom("G");
		etudiant.setId(01);
		etudiant.addLink(getUriforSelf(uriInfo,etudiant), "self", "GET");
		etudiant.addLink(getUriforStage(uriInfo,etudiant), "stage", "GET");
		return etudiant;
	}
	
	private String getUriforStage(UriInfo uriInfo, Etudiant etudiant) {
		String url = uriInfo.getBaseUriBuilder() //http://localhost:8080/RestProject/webapi
				.path(StageRessource.class)  //stage
				.build()
				.toString();
		return url;
	}
	
	private String getUriforSelf(UriInfo uriInfo,Etudiant etudiant) {
		String url = uriInfo.getBaseUriBuilder() //http://localhost:8080/RestProject/webapi
				.path(EtudiantRessource.class)  //stage
				.path(Long.toString(etudiant.getId())) //01
				.build()
				.toString();
		return url;
	}
	
	@GET
	@Path("/{idEtudiant}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant(@PathParam("idEtudiant") int id) {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("A");
		etudiant.setPrenom("B");
		return etudiant;
	}
	
	@POST
	@Path("/{idEtudiant}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEtudiant(Etudiant etudNouv) {
		System.out.println("Ajout de l'étudiant "+etudNouv.getNom()+" "+etudNouv.getPrenom()+ " réussie");
		System.out.println("Son binome est : "+etudNouv.getBinome().getNom()+" "+etudNouv.getBinome().getPrenom());
	}
}

