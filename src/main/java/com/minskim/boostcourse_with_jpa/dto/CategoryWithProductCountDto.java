package com.minskim.boostcourse_with_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
@Getter
public class CategoryWithProductCountDto {
    private Long id;
    private String name;
    private long count;
}
