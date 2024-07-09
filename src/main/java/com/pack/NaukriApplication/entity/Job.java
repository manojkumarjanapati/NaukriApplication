package com.pack.NaukriApplication.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;
    private String jobDesc;
    private String location;
    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;
    @ManyToOne(cascade = CascadeType.ALL)
    private Recruiter recruiter;
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Application> applications;

}
