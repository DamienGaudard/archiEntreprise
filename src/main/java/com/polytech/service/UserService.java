package com.polytech.service;

import com.polytech.persistence.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {

    private UserRepo userRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepo userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void addUser(User user){
        String encode = passwordEncoder.encode(user.getPassword());
        user.setPassword(encode);
        userRepository.save(user);
    }
}
