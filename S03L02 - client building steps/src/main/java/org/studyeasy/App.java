package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("app")
@Singleton
public class App {

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		Client client = ClientBuilder.newClient();
		
		// to get the proper response 
		String response = client.target("http://localhost:8080/L27/showroom/brands/3")
								.request(MediaType.APPLICATION_JSON)
								.get(String.class);
		return response;
	}

}
