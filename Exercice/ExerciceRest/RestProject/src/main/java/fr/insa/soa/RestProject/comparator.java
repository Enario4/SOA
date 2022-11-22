package fr.insa.soa.RestProject;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("comparator")
public class comparator {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Bonjour !";
	}
	
	@GET
	@Path("longueur/{chaine}")
	@Produces(MediaType.TEXT_PLAIN)
	public int getLongueur(@PathParam("chaine") String chaine) {
		return chaine.length();
	}
	
	@GET
	@Path("longueurDouble")
	@Produces(MediaType.TEXT_PLAIN)
	public int getLongueurDouble(@QueryParam("chaine") String chaine) {
		return chaine.length()*2;
	}
	
	@PUT
	@Path("/{idEtudiant}")
	@Consumes(MediaType.TEXT_PLAIN)
	public int updateEtudiant(@PathParam("idEtudiant") int id) {
		System.out.println("mise à jour réussie !!!");
		return id;
	}
}
