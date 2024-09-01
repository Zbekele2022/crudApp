package com.example.crudApp.service;

import com.example.crudApp.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(User user, Long id);
    void deleteUser(Long id);
}
