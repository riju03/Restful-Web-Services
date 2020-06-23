package org.studyeasy.showroom.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="products")
@Table(name="products")
public class ProductEntity {

	@Id
	@Column(name="productId")
	int productId;
	
	/*
	 * @ManyToRefer refer to a table which is not local we are referring to a table which is foreign key, we must give info
	 * of referenced table, so we can't use this @ on primitive data type rather on entity class object.
	 * we must also join the relationship, apply join on brandId present in table brands.
	 * TargetEntity is used to refer the entity class we are referring.
	 */
	
	@ManyToOne(targetEntity = BrandEntity.class)
	@JoinColumn(name="brandId")
	BrandEntity brandEntity;
	
	
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

	

	public BrandEntity getBrandEntity() {
		return brandEntity;
	}

	public void setBrandEntity(BrandEntity brandEntity) {
		this.brandEntity = brandEntity;
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
