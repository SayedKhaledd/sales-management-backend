package com.example.salesmanagement.dao.repo;

import com.example.salesmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    List<Category> findAllByMarkedAsDeletedFalse();
}
