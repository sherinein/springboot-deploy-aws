package org.hibernate.shopping.service;

import java.util.List;

import org.hibernate.shopping.entity.Product;


public interface ProductService {
	
	public void saveProduct(Product product);
		
	public List<Product> getProducts();

	public Product getProduct(int id);

	public void deleteProduct(int id);
	
	public Product updateProduct(int id);
}
