package com.example.cryptoportfolio.service;

import com.example.cryptoportfolio.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);
    List<User> getUsers();
}
