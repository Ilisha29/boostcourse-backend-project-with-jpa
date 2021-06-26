package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ReservationServiceImplTest {
    @Autowired
    ReservationServiceImpl reservationService;

    @Test
    void getCategoryListWithProductCount() {
        List<CategoryWithProductCountDto> category = reservationService.categoryListWithProductCount();
        category.stream().forEach(System.out::println);
    }
}