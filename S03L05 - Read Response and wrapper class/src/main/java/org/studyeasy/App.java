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
		
		
		/*
		 * Response is a entity we can perform numerous operations.
		 * How can we convert json response into POJO object. we want to get response in the form of brand
		 * Include BrandId in POJO class.
		 * 
		 * We need to receive array of objects. 
		 */
		

		Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON).get(Brand[].class);
		for(Brand brand:response) {
			System.out.println(brand);
		}
	}

}
