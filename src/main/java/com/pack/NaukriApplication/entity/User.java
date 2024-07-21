package com.pack.NaukriApplication.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "role")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Admin.class, name = AppConstants.ADMIN),
        @JsonSubTypes.Type(value = JobSeeker.class, name = AppConstants.JOB_SEEKER),
        @JsonSubTypes.Type(value = Recruiter.class, name = AppConstants.RECRUITER)
})
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(insertable = false, updatable = false)
    private String role;
    private String phone;
    @Embedded
    private Login login;

}