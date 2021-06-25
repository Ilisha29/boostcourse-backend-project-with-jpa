package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@ToString
@Getter
@Entity
public class ProductImage {
    @Id
    private Long id;

    @ManyToOne
    private Product product;

    private String type;

    @ManyToOne
    private File file;
}
