package ru.kata.springboot.rest.service;

import ru.kata.springboot.rest.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Role getById(Long id);

    void saveRole(Role role);


}
