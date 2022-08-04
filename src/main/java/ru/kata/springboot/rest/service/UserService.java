package ru.kata.springboot.rest.service;

import ru.kata.springboot.rest.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteById(Long id);

    void updateUser(User user);

    User getById(Long id);

    User findByUsername(String username);

    List<User> findAll();

}
