package com.minskim.boostcourse_with_jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Entity
public class UserRole {
    @Id
    private Long id;

    @NonNull
    @ManyToOne
    private User user;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Role roleName;
}