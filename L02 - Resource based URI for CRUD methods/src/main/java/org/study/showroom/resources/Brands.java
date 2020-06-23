package org.study.showroom.resources;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom") // class level pattern
public class Brands {

	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		return "list of brands";
	}

	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String postBrands() {
		return "add a new brand";
	}

	// if we want to use multiple id's we can use it in below manner
	@PUT
	@Path("/brands/{brandId}/{brandName}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands(@PathParam("brandId") String brandId,
			@PathParam("brandName") String brandName) {
		return "update brand info with id & name:" + brandId+" "+brandName;
	}

	@DELETE
	@Path("/brands/{brandId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands(@PathParam("brandId") int brandId) {
		return "delete brand from DB with id : " + brandId;
	}
}
