package org.studyeasy.model;

import java.util.Arrays;

public class Brand {

	private int BrandId;
	private String brandName;
	private Link[] links;

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	public Brand() {
		super();
	}

	public Brand(int brandId, String brandName, Link[] links) {
		super();
		BrandId = brandId;
		this.brandName = brandName;
		this.links = links;
	}

	public Brand(int brandId, String brandName) {
		super();
		BrandId = brandId;
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getBrandId() {
		return BrandId;
	}

	public void setBrandId(int brandId) {
		BrandId = brandId;
	}

	public Link[] getLinks() {
		return links;
	}

	public void setLinks(Link[] links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Brand [BrandId=" + BrandId + ", brandName=" + brandName + ", links=" + Arrays.toString(links) + "]";
	}

	public String displayBrand() {
		return "Brand [BrandId=" + BrandId + ", brandName=" + brandName + "]";
	}

}
