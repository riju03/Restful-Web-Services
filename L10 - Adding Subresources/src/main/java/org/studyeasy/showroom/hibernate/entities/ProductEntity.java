package org.studyeasy.showroom.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="products")
@Table(name="products")
public class ProductEntity {

	@Id
	@Column(name="productId")
	int productId;
	// we have multiple products for brandId so there is many to one relationship, this will tell hibernate this is FK
	//@ManyToOne
	@Column(name="brandId")
	int brandId;
	@Column(name="productName")
	String productName;
	@Column(name="category")
	String category;
	@Column(name="cost")
	String cost;
	
	public ProductEntity() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
	
}
