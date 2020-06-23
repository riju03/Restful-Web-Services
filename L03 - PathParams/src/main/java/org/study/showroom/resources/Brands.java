package org.study.showroom.resources;



import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
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
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands";
		}
	
	
	// we can not perform post REQUEST on URL, to perform post request we can use extensions 
	// chrome web store - postman
	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String postBrands() {
		return "add a new brand";
		}
	
	// for updating and deleting we must recieve id of a brand
	// to specify brandId is a variable not text we should use {}
	@PUT
	@Path("/brands/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands(@PathParam("brandId") int brandId) { // we need to associate value with variable brandId
		return "update brand info with id :"+brandId;
		}
	
	@DELETE
	@Path("/brands/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands(@PathParam("brandId") int brandId) {
		return "delete brand from DB with id : "+brandId;
		}
}

