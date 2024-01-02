package models;

import java.util.List;

public class ProductCategory {
	private List<ProductCategory> childrenCategories;
	
	private String name;
	
	private List<Product> products;
}
