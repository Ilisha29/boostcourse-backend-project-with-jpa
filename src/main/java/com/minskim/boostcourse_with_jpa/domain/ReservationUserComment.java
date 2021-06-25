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
public class ReservationUserComment {
    @Id
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private ReservationInfo reservationInfo;

    @ManyToOne
    private User user;

    private int score;

    private String comment;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
