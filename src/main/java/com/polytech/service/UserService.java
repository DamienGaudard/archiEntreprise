package com.polytech.service;

import com.polytech.persistence.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(User user){
        String encode = passwordEncoder.encode(user.getPassword());
        user.setPassword(encode);
        userRepository.save(user);
    }
}
