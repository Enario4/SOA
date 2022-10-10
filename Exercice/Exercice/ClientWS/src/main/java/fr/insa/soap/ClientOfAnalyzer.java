package fr.insa.soap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import fr.insa.soap.AnalyserChaineApplication;
import fr.insa.soap.Analyzer;

public class ClientOfAnalyzer {

	public static void main(String [] args) throws MalformedURLException {
	
	//l'adresse du service Web
	final String adresse="http://Locathost:8089/analyzer";
	
	//Creation de L'URL final URL 
	final URL url=URI.create(adresse).toURL();
	
	//Instancation de l'image du service final
	final AnalyserChaineApplication service= new AnalyserChaineApplication(url);
	
	//Création du proxy (en utilisant le portType) pour l'appel du service
	final Analyzer port = service.getPort(Analyzer.class);
	
	String chaine ="aaaa";	
	//appel de la méthode compare via le port	
	System.out.println("La taille de la chaine "+chaine+" est " +port.analyser("aaaa"));
	
	}
}
