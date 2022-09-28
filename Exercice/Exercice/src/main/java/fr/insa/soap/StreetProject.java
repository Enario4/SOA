package fr.insa.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="lastreet")
public class StreetProject {
	
	@WebMethod(operationName="hello")
	public String sayHello(@WebParam(name="chain") String chaine) {
		return "Hello " + chaine;
	}
	
	@WebMethod(operationName="age")
	public String getAge(@WebParam(name="year") int annee) {
		return "Vous avez " + Integer.toString(annee-2017) + " ans";
	}

}
