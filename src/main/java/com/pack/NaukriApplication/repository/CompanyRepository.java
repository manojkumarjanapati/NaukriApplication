package com.pack.NaukriApplication.repository;

import com.pack.NaukriApplication.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
