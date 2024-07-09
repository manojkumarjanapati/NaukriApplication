package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue(AppConstants.RECRUITER)
public class Recruiter extends User {
    @ManyToOne(cascade = CascadeType.ALL)
    private Company company;
    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Job> jobs;

    @Override
    public String getRole() {
        return AppConstants.RECRUITER;
    }

}
