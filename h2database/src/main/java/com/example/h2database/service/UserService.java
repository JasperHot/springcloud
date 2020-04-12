package com.example.h2database.service;

import com.example.h2database.domain.User;

import java.util.Collection;

public interface UserService {
    User getUser(Long userId);
    Collection<User> getUsers();
    void createUser(User user);
    void deleteUser(Long userId);
}
