package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@ToString
@Getter
@Entity
public class User {
    @Id
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String password;

    @NonNull
    @Column(unique = true)
    private String email;

    @NonNull
    @Column(unique = true)
    private String phone;

    private LocalDate createDate;
    private LocalDate modifyDate;
}
