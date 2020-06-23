package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * Postman is client in the form of chrome extension and this help us to request restful API.
 * We will build the client similar to this but for this we need API so we are taking HATEOAS we already build.
 */

@Path("app")
@Singleton
public class App {

	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/L27/showroom/brands/3").request().get();
		return response.toString();
	}

}
