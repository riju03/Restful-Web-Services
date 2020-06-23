package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("app")
@Singleton
public class App {

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		Client client = ClientBuilder.newClient();
		
		/* webTarget is an object of client target.
		   multiple steps involved in hitting url and getting response.
		   Here we are hard coding the URL which is not a good solution, it will be good if we create a web target and
		   concatenate specific type later 
		*/
		WebTarget baseBrandsURL = client.target("http://localhost:8080/L27/showroom/brands");
		
		//TO get specific brand
		WebTarget brandURL = baseBrandsURL.path("{brandId}");
		
		String response = brandURL
				.resolveTemplate("brandId", "3")
				.request(MediaType.APPLICATION_JSON)
				.get(String.class);
		return response;
	}

}
