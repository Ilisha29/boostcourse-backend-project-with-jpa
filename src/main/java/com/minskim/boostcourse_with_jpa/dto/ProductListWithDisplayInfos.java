package com.minskim.boostcourse_with_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Builder
@ToString
@Getter
public class ProductListWithDisplayInfos {
    private Long id;
    private Long categoryId;
    private Long displayInfoId;
    private String name;
    private String description;
    private String content;
    private String event;
    private String openingHours;
    private String placeName;
    private String placeLot;
    private String placeStreet;
    private String tel;
    private String homepage;
    private String email;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private Long fileId;
}
