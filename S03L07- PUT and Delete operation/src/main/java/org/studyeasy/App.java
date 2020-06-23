package org.studyeasy;

import javax.inject.Singleton;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.studyeasy.model.Brand;

@Singleton
public class App {

	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client.target("http://localhost:8080/L27/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");

	public static void main(String[] args) {
		
		
		
		//update brand Info
		
		/*Response response = brandURL.resolveTemplate("brandId", "3")
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.json(new Brand("Yamaha")));
		
		System.out.println(response.getStatus());*/
		
		//delete info
		
		Response response = brandURL.resolveTemplate("brandId", "3")
				.request(MediaType.APPLICATION_JSON)
				.delete();
		
		System.out.println(response.getStatus());
	}
	

}
