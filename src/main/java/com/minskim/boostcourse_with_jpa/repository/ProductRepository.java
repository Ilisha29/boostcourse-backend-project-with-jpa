package com.minskim.boostcourse_with_jpa.repository;

import com.minskim.boostcourse_with_jpa.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    long countByCategory_Id(Long id);
}
