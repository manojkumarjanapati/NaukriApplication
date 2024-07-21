package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@DiscriminatorValue(AppConstants.RECRUITER)
public class Recruiter extends User {
    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;
    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Job> jobs = new HashSet<>();

    @Override
    public String getRole() {
        return AppConstants.RECRUITER;
    }

}
