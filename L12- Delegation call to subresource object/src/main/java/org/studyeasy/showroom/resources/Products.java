package org.studyeasy.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.ProductsService;

//@Path("/showroom/brands")
public class Products {

	ProductsService productsService = new ProductsService();

	@GET
	//@Path("/dummy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByName(@PathParam("brandId") int brandId) {
		List<ProductEntity> list  = productsService.getProductsByBrand(brandId);
		return list;
	}
}
