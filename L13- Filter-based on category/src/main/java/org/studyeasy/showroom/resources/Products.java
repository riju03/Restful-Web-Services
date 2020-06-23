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
 *  we need to categorize products based on category, get the products where category is bike.
 *  This can be implemented by using filters
 *  
 *   URI: /brands/2/products?category=bike
 *   
 *   ?category=bike is query param
 *   whatever information we provide will be passed in query param category
 */

public class Products {

	ProductsService productsService = new ProductsService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByName(@PathParam("brandId") int brandId,
			@QueryParam("category") String category) {
		List<ProductEntity> productList;

		if (category != null) {
			productList = productsService.getProductsByBrandAndCategory(brandId,category);
			return productList;
			
		} else {

			productList = productsService.getProductsByBrand(brandId);
			return productList;
		}
	}
}
