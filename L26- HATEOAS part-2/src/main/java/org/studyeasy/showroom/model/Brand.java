package org.studyeasy.showroom.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity(name="brands")
@Table(name="brands")
public class Brand {
	@Id
	@Column(name="brandId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)// specify id will be automatically generated, this id is identity of entire row
	private int brandId;
	
	@Column(name="brandName")
	private String brandName;
	
	// hibernate will try to map this field as a column in database to stop this we use @Transient
	// now we want to have multiple links so need to have List
	@Transient
	private List<Link> links;
	
	public Brand() {
		
	}

	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	

	
}
