package com.example.salesmanagement.dao.repo;

import com.example.salesmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.salesmanagement.model.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAllByMarkedAsDeletedFalse();

}
