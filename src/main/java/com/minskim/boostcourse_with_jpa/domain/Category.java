package com.minskim.boostcourse_with_jpa.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private Long id;

    @NonNull
    private String name;
}
