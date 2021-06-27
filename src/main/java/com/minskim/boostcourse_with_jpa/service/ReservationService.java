package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.domain.Promotion;
import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import com.minskim.boostcourse_with_jpa.dto.ProductListWithDisplayInfosDto;
import com.minskim.boostcourse_with_jpa.dto.PromotionWithProductDto;

import java.util.List;

public interface ReservationService {
    List<CategoryWithProductCountDto> getCategoryListWithProductCount();

    ProductListWithDisplayInfosDto getProductListWithDisplayInfos();

    List<PromotionWithProductDto> getPromotions();
}
