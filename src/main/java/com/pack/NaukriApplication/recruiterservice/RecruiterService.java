package com.pack.NaukriApplication.recruiterservice;

import com.pack.NaukriApplication.model.Recruiter;
import jakarta.persistence.Id;

import java.util.List;

public interface RecruiterService {
//    Recruiter createRecruiter(Recruiter recruiter);
    Recruiter saveRecruiter(Recruiter recruiter);
    List<Recruiter> getAllRecruiters();
    Recruiter getRecruiterById(long recruiterId);
    Recruiter updateRecruiter(Recruiter recruiter, long Id);
    void deleteRecruiter(Recruiter recruiter, long Id);
}
