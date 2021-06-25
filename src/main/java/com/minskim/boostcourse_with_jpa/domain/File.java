package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@ToString
@Getter
@Entity
public class File {
    @Id
    private Long id;

    @NonNull
    @Column(length = 4000)
    private String fileName;

    @NonNull
    private String saveFileName;

    @NonNull
    private String contentType;

    @NonNull
    private int deleteFlag;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
