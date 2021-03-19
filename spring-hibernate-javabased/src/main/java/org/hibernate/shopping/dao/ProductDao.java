package org.hibernate.shopping.dao;

import java.util.List;

import org.hibernate.shopping.entity.Product;

public interface ProductDao {
	
	public void saveProduct(Product product);
	public List<Product> getProducts();
	public Product getProduct(int id);
	public void deleteProduct(int id);
	public Product updateProduct(int id);
}
