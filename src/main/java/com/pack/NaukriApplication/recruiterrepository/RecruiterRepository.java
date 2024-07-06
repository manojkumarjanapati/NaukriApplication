package com.pack.NaukriApplication.recruiterrepository;

import com.pack.NaukriApplication.model.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepository extends JpaRepository<Recruiter,Long> {
}
