package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.domain.Category;
import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import com.minskim.boostcourse_with_jpa.repository.CategoryRepository;
import com.minskim.boostcourse_with_jpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Override
    public List<CategoryWithProductCountDto> categoryListWithProductCount() {
        List<CategoryWithProductCountDto> list = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();
        for (Category c : categories) {
            long count = productRepository.countByCategory_Id(c.getId());
            list.add(CategoryWithProductCountDto.builder()
                    .id(c.getId())
                    .name(c.getName())
                    .count(count)
                    .build());
        }
        return list;
    }
}
