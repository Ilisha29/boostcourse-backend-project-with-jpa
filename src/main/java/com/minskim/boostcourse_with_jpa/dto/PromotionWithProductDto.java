package com.minskim.boostcourse_with_jpa.dto;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PromotionWithProductDto {
    private Long id;
    private Long productId;
    private Long categoryId;
    private String categoryName;
    private String description;
    private Long fileId;
}
