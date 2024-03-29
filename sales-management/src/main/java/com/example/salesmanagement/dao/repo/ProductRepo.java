package com.example.salesmanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.salesmanagement.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
