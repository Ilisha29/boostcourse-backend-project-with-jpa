package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Getter
@Entity
public class Category {
    @Id
    private Long id;

    @NonNull
    private String name;
}
