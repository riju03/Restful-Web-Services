package org.studyeasy;

import javax.inject.Singleton;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.studyeasy.model.Brand;

/*our API have all the functionality
  We will try to implement same POST functionality using client */


@Singleton
public class App {

	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client.target("http://localhost:8080/L27/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");

	public static void main(String[] args) {
		
		// entity is the wrapped data
		/*
		 * in postman we have set the data in the form of JSON there must be some way to generate the json format 
		 * so that we can post the data in database.
		 * In order to do that we need a class that symbolizes this data so we make Brand model class.
		 * 
		 * Response is a wrapper class, this is an Entity we have numerous things we can do
		 */
		

		Response response = baseBrandURL.request(MediaType.APPLICATION_JSON).post(Entity.json(new Brand("New Brand 10")));
		System.out.println(response.toString());
	}

}
