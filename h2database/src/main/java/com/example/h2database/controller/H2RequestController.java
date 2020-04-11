package com.example.h2database.controller;

import com.example.h2database.domain.User;
import com.example.h2database.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Slf4j
@RestController
public class H2RequestController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody User user){
        log.info(">>>Create<<< user name("+user.getName()+") sex("+user.getSex()+") age("+user.getAge()+")");
        userService.createUser(user);
    }

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.FOUND)
    public User getUser(@RequestParam("userId")Long userId) {
        User user=userService.getUser(userId);
        log.info("###1Found### user name("+user.getName()+") sex("+user.getSex()+") age("+user.getAge()+")");
        return user;
    }
    @GetMapping("/user/{userId}")
    @ResponseStatus(HttpStatus.FOUND)
    public User getUser2(@PathVariable("userId")Long userId) {
        User user=userService.getUser(userId);
        log.info("###2Found### user name("+user.getName()+") sex("+user.getSex()+") age("+user.getAge()+")");
        return user;
    }
    @DeleteMapping("/user/{userId}")
    public void delete(@PathVariable("userId")Long userId){
        User user=userService.getUser(userId);
        if(user!=null) {
            userService.deleteUser(userId);
            log.info("===Delete=== user name("+user.getName()+") sex("+user.getSex()+") age("+user.getAge()+")");
        }

    }
}
