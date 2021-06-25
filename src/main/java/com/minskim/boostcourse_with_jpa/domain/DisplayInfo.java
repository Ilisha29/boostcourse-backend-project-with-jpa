package com.minskim.boostcourse_with_jpa.domain;


import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@ToString
@Getter
@Entity
public class DisplayInfo {
    @Id
    private Long id;

    @ManyToOne
    private Product product;

    @Column(length = 400)
    private String openingHours;

    private String placeName;
    private String placeLot;
    private String placeStreet;

    private String tel;
    private String homepage;

    private String email;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
