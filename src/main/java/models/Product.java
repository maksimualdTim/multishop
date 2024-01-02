package models;

import java.util.List;

public class Product {

	private String name;
	
	private String shortDescription;
	
	private String description;
	
	private Money price;
	
	private Money salesPrice;
	
	private List<ProductVariation> variations;
	
	private List<ProductAttribute> attributes;
	
	private String additionalInformation;
	
	private List<ProductReview> reviews;
	
	private ProductCategory category;
	
	private Image preview;
	
	private List<Image> gallery;
	
	
	
	
}
