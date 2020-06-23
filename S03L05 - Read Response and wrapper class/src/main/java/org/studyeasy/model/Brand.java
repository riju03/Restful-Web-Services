package org.studyeasy.model;

public class Brand {

	private int BrandId;
	private String brandName;

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	
	
	
	public Brand() {
		super();
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



	@Override
	public String toString() {
		return "Brand [BrandId=" + BrandId + ", brandName=" + brandName + "]";
	}
	
	
	
	
}
