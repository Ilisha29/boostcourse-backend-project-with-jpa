package com.minskim.boostcourse_with_jpa.controller;

import com.minskim.boostcourse_with_jpa.domain.Category;
import com.minskim.boostcourse_with_jpa.repository.CategoryRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ReservationController {
    private final CategoryRepository categoryRepository;

    public ReservationController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    public ResponseEntity getCategoryList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        List<Category> categories = categoryRepository.findAll();
        categories.stream().forEach(System.out::println);
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}
