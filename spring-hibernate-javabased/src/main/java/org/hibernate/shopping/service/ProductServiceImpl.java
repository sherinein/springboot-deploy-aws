package org.hibernate.shopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.shopping.dao.ProductDao;
import org.hibernate.shopping.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productdao;

	@Override
	@Transactional
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productdao.getProducts();
	}

	@Override
	@Transactional
	public void saveProduct(Product product) {
		productdao.saveProduct(product);
		
	}

	@Override
	@Transactional
	public Product getProduct(int id) {
		return productdao.getProduct(id);
	}

	@Override
	@Transactional
	public void deleteProduct(int id) {
		productdao.deleteProduct(id);
	}

	@Override
	public Product updateProduct(int id) {
		return productdao.updateProduct(id);
	}

}
