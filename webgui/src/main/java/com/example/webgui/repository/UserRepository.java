package com.example.webgui.repository;

import com.example.webgui.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);

    void deleteById(Long id);
}
