package com.minskim.boostcourse_with_jpa.repository;


import com.minskim.boostcourse_with_jpa.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
