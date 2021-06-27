package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.domain.Product;
import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;
import com.minskim.boostcourse_with_jpa.dto.ProductListWithDisplayInfosDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReservationService {
    List<CategoryWithProductCountDto> categoryListWithProductCount();

    ProductListWithDisplayInfosDto productListWithDisplayInfos();
}
