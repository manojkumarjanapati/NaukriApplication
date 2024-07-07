package com.pack.NaukriApplication.entity;

import com.pack.NaukriApplication.dao.AppConstants;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue(AppConstants.ADMIN)
public class Admin extends User {

    @Override
    public String getRole() {
        return AppConstants.ADMIN;
    }
}
