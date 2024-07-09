package com.pack.NaukriApplication.service;

import com.pack.NaukriApplication.entity.Login;
import com.pack.NaukriApplication.entity.User;
import com.pack.NaukriApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(Login login) {
        return userRepository.findByLogin(login);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }


}
