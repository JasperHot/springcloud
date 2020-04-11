package com.example.h2database.service;

import com.example.h2database.domain.User;

public interface UserService {
    User getUser(Long userId);
    void createUser(User user);
    void deleteUser(Long userId);
}
