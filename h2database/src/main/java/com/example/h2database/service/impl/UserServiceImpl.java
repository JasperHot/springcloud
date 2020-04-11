package com.example.h2database.service.impl;

import com.example.h2database.dao.UserJpaRepository;
import com.example.h2database.domain.User;
import com.example.h2database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserJpaRepository userJpaRepository;
    @Override
    public User getUser(Long userId) {
        return userJpaRepository.findById(userId).orElse(new User());
    }

    @Override
    public void createUser(User user) {
        userJpaRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
          User user=getUser(userId);
          userJpaRepository.delete(user);
    }

    public Collection<User> getUsers(){
        return userJpaRepository.findAll();
    }
}
