package com.pack.NaukriApplication.repository;

import com.pack.NaukriApplication.entity.Login;
import com.pack.NaukriApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(Login login);
}
