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
		
		
		//get brands
	/*	 Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON).get(Brand[].class);
			for(Brand brand:response) {
			System.out.println(brand.displayBrand());
		} 
	*/
		/*
		
		// get by brand
		Brand specificBrand = brandURL
							 .resolveTemplate("brandId", "3")
							 .request()
							 .get(Brand.class);
		
		System.out.println(specificBrand);
		
		*/
		
		//Post
		 Response response = baseBrandURL.request().post(Entity.json(new Brand("Mahindra")));
				 
			System.out.println(response.readEntity(Brand.class).displayBrand());
	}

}
