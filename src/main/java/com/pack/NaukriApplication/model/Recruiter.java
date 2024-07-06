package com.pack.NaukriApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="recruiter")

public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long recruiterId;
    private String companyName;
    private String role;
    private float experience;
    private String requiredSkills;
    private String location;
    private float salary;

}

