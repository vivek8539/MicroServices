package com.vivek.user.service.controller;

import com.vivek.user.service.entities.User;
import com.vivek.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> Save(@RequestBody User user){

        userService.save(user);
        return new ResponseEntity<>(user , HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return  new ResponseEntity<>(userService.findAll(),HttpStatus.OK);
    }
}
