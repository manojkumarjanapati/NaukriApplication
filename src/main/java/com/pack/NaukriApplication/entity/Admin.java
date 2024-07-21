package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue(AppConstants.ADMIN)
public class Admin extends User {

    @Override
    public String getRole() {
        return AppConstants.ADMIN;
    }
}
