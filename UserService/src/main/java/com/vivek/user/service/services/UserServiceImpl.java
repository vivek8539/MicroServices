package com.vivek.user.service.services;

import com.vivek.user.service.entities.User;
import com.vivek.user.service.exception.ResourceNotFoundException;
import com.vivek.user.service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {

        return userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!"));
    }
}
