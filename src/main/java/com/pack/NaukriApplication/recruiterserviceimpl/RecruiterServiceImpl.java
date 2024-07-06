package com.pack.NaukriApplication.recruiterserviceimpl;

import com.pack.NaukriApplication.model.Recruiter;
import com.pack.NaukriApplication.recruiterrepository.RecruiterRepository;
import com.pack.NaukriApplication.recruiterservice.RecruiterService;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterServiceImpl implements RecruiterService{
    private final RecruiterRepository recruiterRepository;

    public RecruiterServiceImpl(RecruiterRepository recruiterRepository) {
        super();
        this.recruiterRepository = recruiterRepository;
    }

//    @Override
//    public Recruiter createRecruiter(Recruiter recruiter) {
//        return recruiterRepository.save(recruiter);
//    }

    @Override
    public Recruiter saveRecruiter(Recruiter recruiter) {
        return recruiter;
    }

    @Override
    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }

    @Override
    public Recruiter getRecruiterById(long recruiterId) {
        Optional<Recruiter> rec = recruiterRepository.findById(recruiterId);
        return rec.orElse(null);
    }

    @Override
    public Recruiter updateRecruiter(Recruiter recruiter, long Id) {
        Recruiter rec1 = recruiterRepository.findById(Id).orElseThrow(null);
        rec1.setRole(rec1.getRole());
        rec1.setExperience(rec1.getExperience());
        rec1.setCompanyName(rec1.getCompanyName());
        recruiterRepository.save(rec1);
        return rec1;
    }

    @Override
    public void deleteRecruiter(Recruiter recruiter, long Id) {
        recruiterRepository.deleteById(Id);
    }


}
