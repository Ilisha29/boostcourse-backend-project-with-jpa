package com.minskim.boostcourse_with_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Builder
@ToString
@Getter
public class ProductListWithDisplayInfosDto {
    private int totalCount;
    private int productCount;
    private List<ProductListWithDisplayInfos> products;
}
