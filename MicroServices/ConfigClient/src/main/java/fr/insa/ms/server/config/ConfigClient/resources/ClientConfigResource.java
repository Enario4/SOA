package fr.insa.ms.server.config.ConfigClient.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientConfigResource {
	
	@Value("${server.port}")
	private String serverPort;
	@Value("${db.connection}")
	private String typeConnectionDeDB;
	@Value("${db.host}")
	private String dbHost;
	@Value("${db.port}")
	private String dbPort;
	
	public String getServerPort() {
		return serverPort;
	}
	
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	
	public String getTypeConnectionDeDB() {
		return typeConnectionDeDB;
	}
	
	public void setTypeConnectionDeDB(String typeConnectionDeDB) {
		this.typeConnectionDeDB = typeConnectionDeDB;
	}
	
	@GetMapping("/dbHost")
	public String getDbHost() {
		return dbHost;
	}
	
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	
	public String getDbPort() {
		return dbPort;
	}
	
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}
	
	
}
