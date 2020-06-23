package org.study.showroom.resources;



import java.util.List;

import org.study.showroom.hibernate.entities.BrandEntity;
import org.study.showroom.services.BrandsService;

import jakarta.ws.rs.Consumes;
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
 

	
	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public List<Brands> getBrands() {
		List<Brands> list = new BrandsService().getBrands(); // this service layer will give list of brands
		return list;
		}
	
	
	// we are adding row in database, we must have entity class that symbolizes the table in database
	
	@POST
	@Path("/brands")
	@Consumes(MediaType.TEXT_PLAIN)// this method consumes the request and will add information in the databse
	public void postBrands(BrandEntity brand) {
		new BrandsService().addBrand(brand);
		}
	
	
	// it will update information and will not return anything, it will consume object
	@PUT
	@Path("/brands/{brandId}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void putBrands(@PathParam("brandId") int brandId, BrandEntity updatedBrand) { 
		updatedBrand.setBrandId(brandId);
		new BrandsService().updateBrand(updatedBrand);
		
		}
	
	@DELETE
	@Path("/brands/{brandId}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void deleteBrands(@PathParam("brandId") int brandId) {
		new BrandsService().deleteBrand(brandId);
		}
}

