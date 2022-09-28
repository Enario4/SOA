package fr.insa.soap;

import java.net.MalformedURLException;
import javax.xml.ws.Endpoint;

public class StreetProjectApp {

	public static String  host="localhost";
	public static short port = 8089;
	
	public void demarrerService() {
		String url="http://"+host+":"+port+"/";
		Endpoint.publish(url,  new StreetProject());
	}
	
	public static void main(String [] args) throws MalformedURLException {
		
		new StreetProjectApp().demarrerService();
		System.out.println("Service a démarré");
	}

}