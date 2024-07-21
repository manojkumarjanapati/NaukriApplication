package com.pack.NaukriApplication.service;

import com.pack.NaukriApplication.entity.Login;
import com.pack.NaukriApplication.entity.Recruiter;
import com.pack.NaukriApplication.entity.User;
import com.pack.NaukriApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(Login login) {
        return userRepository.findByLogin(login);
    }

    public User saveUser(User user) {
        if (user instanceof Recruiter) {
            ((Recruiter) user).getJobs().forEach(job -> {
                job.setRecruiter((Recruiter) user);
                job.setCompany(((Recruiter) user).getCompany());
            });
            ((Recruiter) user).getCompany().getRecruiters().add((Recruiter) user);
            ((Recruiter) user).getCompany().getJobs().addAll(((Recruiter) user).getJobs());
        }
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
