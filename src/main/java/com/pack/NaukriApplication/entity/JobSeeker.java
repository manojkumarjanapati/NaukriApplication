package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@DiscriminatorValue(AppConstants.JOBSEEKER)
public class JobSeeker extends User {

    private String education;
    private String experience;
    private String skills;

    @Override
    public String getRole() {
        return AppConstants.JOBSEEKER;
    }

}