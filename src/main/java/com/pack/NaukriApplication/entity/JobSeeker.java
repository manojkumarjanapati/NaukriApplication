package com.pack.NaukriApplication.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@DiscriminatorValue("Jobseeker")
public class JobSeeker extends User {

    private String education;
    private String experience;
    private String skills;

}