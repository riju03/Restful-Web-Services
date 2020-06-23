package org.study.showroom.resources;



import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom") //class level pattern
public class Brands {
 
	/*
	 * whenever we have URI showroom class will handle the request.
	 * and we have child URI /getBrands it will be handled by method.
	 * we also need to specify what request are handling.
	 */
	
	@GET
	@Path("/getBrands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands";
		}
	
	
	// we can not perform post REQUEST on URL, to perform post request we can use extensions 
	// chrome web store - postman
	@POST
	@Path("/setBrand")
	@Produces(MediaType.TEXT_PLAIN)
	public String setBrands() {
		return "add a new brand";
		}
}

