package ru.kata.springboot.rest.service;

import ru.kata.springboot.rest.model.Role;
import ru.kata.springboot.rest.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class UserPostConstruct {

    private final UserService userService;
    private final RoleService roleService;

    private UserPostConstruct(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @PostConstruct
    private void postConstruct() {
        roleService.saveRole(new Role(1L, "ADMIN"));
        roleService.saveRole(new Role(2L, "USER"));
        userService.saveUser(new User("admin@mail.ru", "admin",
                new ArrayList<>(roleService.findAll()),
                "David", "Pervakov", 27));
        userService.saveUser(new User("user@mail.ru", "user",
                roleService.findAll().stream().filter(e -> e.getRoleName()
                        .contains("USER")).collect(Collectors.toList()),
                "Sergey", "Shagov", 28));
    }
}
