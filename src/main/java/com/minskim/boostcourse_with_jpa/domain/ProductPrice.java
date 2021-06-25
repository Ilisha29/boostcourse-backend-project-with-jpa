package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@ToString
@Getter
@Entity
public class ProductPrice {
    @Id
    private Long id;

    @ManyToOne
    private Product product;

    private String priceTypeName;

    private int price;
    private int discountRate;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
