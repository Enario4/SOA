package fr.insa.soa.RestProject;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.Response;

public class ClientRest {
	public static void main(String [] args) {
		
		//instanciation de Client,necessaire pour l'execution des requetes et la consommation des réponses
		Client client=ClientBuilder.newClient();
		//appel du service Rest, invocation de la méthode get correspondant à l'URL
		Response response=client.target("http://localhost:8080/RestProject/webapi/comparator/longueurDouble?chaine=Toulouse").request().get();
		//lecture de la réponse récupérée
		System.out.println(response.readEntity(String.class));
	}

}
