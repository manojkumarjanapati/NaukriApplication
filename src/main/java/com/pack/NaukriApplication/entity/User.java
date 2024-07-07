package com.pack.NaukriApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
public abstract class User {
    public static enum Role {
        ADMIN,
        JOB_SEEKER,
        RECRUITER;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(insertable = false, updatable = false) // Prevent direct modification of discriminator column
    private Role role;
    private String phone;
    @Embedded
    private Login login;

}