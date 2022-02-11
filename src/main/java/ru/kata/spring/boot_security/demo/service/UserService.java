package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

public interface UserService {

    User findByUsername(String username);
    User findById(Long id);
    Iterable<User> findAll();
    String save(User user, String adm);
    String update(User user, String roleAdmin, String pass);
    void deleteById(Long id);

}
