package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@DiscriminatorValue(AppConstants.JOB_SEEKER)
public class JobSeeker extends User {

    private String education;
    private String experience;
    private String skills;

    @Override
    public String getRole() {
        return AppConstants.JOB_SEEKER;
    }

}