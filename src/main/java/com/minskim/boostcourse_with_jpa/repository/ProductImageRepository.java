package com.minskim.boostcourse_with_jpa.repository;

import com.minskim.boostcourse_with_jpa.domain.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
    ProductImage findByProduct_IdAndTypeContains(Long productId, String type);
}
