package org.fns.eshop.repository;



import org.fns.eshop.dto.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	

}
