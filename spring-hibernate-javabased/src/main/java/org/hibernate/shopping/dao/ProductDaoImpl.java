package org.hibernate.shopping.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.shopping.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Product> theQuery = currentSession.createQuery("from Product order by productName", Product.class);

		// execute query and get result list
		List<Product> products = theQuery.getResultList();

		// return the results
		return products;
	}

	@Override
	public void saveProduct(Product product) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer ... finally LOL
		currentSession.save(product);

	}

	@Override
	public Product getProduct(int id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Product product = currentSession.get(Product.class, id);

		return product;
		
	}

	@Override
	public void deleteProduct(int id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query query = 
				currentSession.createQuery("delete from Product where pid=:productId");
		query.setParameter("productId", id);
		
		query.executeUpdate();	

	}

	@Override
	public Product updateProduct(int id) {
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				// now retrieve/read from database using the primary key
				Product product = currentSession.get(Product.class, id);
				// save the customer ... finally LOL
				currentSession.update(product);
		return product;
	}

}
