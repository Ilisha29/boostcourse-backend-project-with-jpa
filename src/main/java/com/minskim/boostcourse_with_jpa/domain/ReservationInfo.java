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
public class ReservationInfo {
    @Id
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private DisplayInfo displayInfo;

    @ManyToOne
    private User user;

    private LocalDate reservationDate;
    
    private int cancelFlag = 0;
    private LocalDate createDate;
    private LocalDate modifyDate;
}
