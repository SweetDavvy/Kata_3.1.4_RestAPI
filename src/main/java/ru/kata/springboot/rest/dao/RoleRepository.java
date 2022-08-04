package ru.kata.springboot.rest.dao;

import ru.kata.springboot.rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
