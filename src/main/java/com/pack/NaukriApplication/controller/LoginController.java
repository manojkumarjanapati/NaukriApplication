package com.pack.NaukriApplication.controller;

import com.pack.NaukriApplication.entity.Login;
import com.pack.NaukriApplication.entity.User;
import com.pack.NaukriApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/naukri")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Login login) {
        User user = userService.login(login);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            throw new NoSuchElementException("Invalid Credentials: " + login);
        }

    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex) {
        return ResponseEntity.notFound().build();
    }


}
