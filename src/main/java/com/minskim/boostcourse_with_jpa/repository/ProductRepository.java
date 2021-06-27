package com.minskim.boostcourse_with_jpa.repository;

import com.minskim.boostcourse_with_jpa.domain.Category;
import com.minskim.boostcourse_with_jpa.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    long countByCategory_Id(Long id);

    @Query("SELECT p FROM Product p WHERE p.category.id = ?1")
    Page<Product> findByCategory_Id(Long categoryId, Pageable pageable);
}
