package org.studyeasy.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.ProductsService;

/*
 * To give a facility to user to filter the  data based on start and size of the data.
 */

public class Products {

	ProductsService productsService = new ProductsService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<ProductEntity> getProductsByName(@PathParam("brandId") int brandId,
			@QueryParam("category") String category,@QueryParam("start") int start,
			@QueryParam("end") int end) {
		List<ProductEntity> productList;

		if (category != null) {
			productList = productsService.getProductsByBrandAndCategory(brandId,category);
			
			
		} else {

			productList = productsService.getProductsByBrand(brandId);
			
		}
		if(end>0) {
			productList = productList.subList(start, end);
		}
		return productList;
	}
}
