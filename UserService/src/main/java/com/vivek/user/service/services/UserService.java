package com.vivek.user.service.services;

import com.vivek.user.service.entities.User;

import java.util.List;

public interface UserService {

    //creste User
    void save(User user);
    List<User> findAll();
    User getById(int id);
}
