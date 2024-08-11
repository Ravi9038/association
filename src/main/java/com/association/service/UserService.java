package com.association.service;

import com.association.model.User;
import com.association.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveData(User user) {
        return userRepository.saveAndFlush(user);
    }

    public Optional<User> getData(Integer id) {
        User user = new User();
        Optional<User> userData = userRepository.findById(id);
        log.info("User details: {}", userData);

        //List<User> userLst = userRepository.findByUserName("ravijadhav9037@gmail.com");
        return userData;
    }
}
