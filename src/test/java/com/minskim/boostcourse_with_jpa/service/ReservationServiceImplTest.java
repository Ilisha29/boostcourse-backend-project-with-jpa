package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.domain.Promotion;
import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import com.minskim.boostcourse_with_jpa.dto.PromotionWithProductDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ReservationServiceImplTest {
    @Autowired
    ReservationServiceImpl reservationService;

    @Test
    void getCategoryListWithProductCount() {
        List<CategoryWithProductCountDto> category = reservationService.getCategoryListWithProductCount();
        category.stream().forEach(System.out::println);
    }

    @Test
    void getProductWithDisplayInfos() {
        System.out.println(reservationService.getProductListWithDisplayInfos());
    }

    @Test
    void getPromotions(){
        List<PromotionWithProductDto> promotionWithProductDto = reservationService.getPromotions();
        promotionWithProductDto.stream().forEach(System.out::println);
    }
}