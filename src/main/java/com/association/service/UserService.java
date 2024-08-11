package com.association.service;

import com.association.model.User;
import com.association.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveData(User user) {
        return userRepository.saveAndFlush(user);
    }

    public Optional<User> getData(Integer id) {
        return userRepository.findById(id);
    }
}
