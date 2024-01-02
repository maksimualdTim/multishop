package models;

import java.util.List;

public class Product {

	private Integer id;
	
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

	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public Money getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Money salesPrice) {
		this.salesPrice = salesPrice;
	}

	public List<ProductVariation> getVariations() {
		return variations;
	}

	public void setVariations(List<ProductVariation> variations) {
		this.variations = variations;
	}

	public List<ProductAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ProductAttribute> attributes) {
		this.attributes = attributes;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public Image getPreview() {
		return preview;
	}

	public void setPreview(Image preview) {
		this.preview = preview;
	}

	public List<Image> getGallery() {
		return gallery;
	}

	public void setGallery(List<Image> gallery) {
		this.gallery = gallery;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
