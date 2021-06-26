package com.minskim.boostcourse_with_jpa.service;

import com.minskim.boostcourse_with_jpa.dto.CategoryWithProductCountDto;

import java.util.List;

public interface ReservationService {
    List<CategoryWithProductCountDto> categoryListWithProductCount();
}
