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
public class Product {
    @Id
    private Long id;

    @ManyToOne
    private Category category;

    private String description;

    private String content;

    private String event;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
