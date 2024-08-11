package com.association.controller;

import com.association.model.User;
import com.association.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    public User saveUsers(@RequestBody User user){

        return userService.saveData(user);
    }
    @GetMapping("/getuser/{id}")
    public Optional<User> getUsers(@PathVariable Integer id){
        Optional<User> userData = userService.getData(id);
        log.info("User details: {}", userData);
        return userData;
    }
}
