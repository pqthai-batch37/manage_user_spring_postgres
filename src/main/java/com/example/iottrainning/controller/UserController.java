package com.example.iottrainning.controller;


import com.example.iottrainning.entity.User;
import com.example.iottrainning.model.dto.UserDto;
import com.example.iottrainning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> getlistUser(){
        List <UserDto> users = userService.getlistUser();
        return ResponseEntity.ok(users);
    }

   @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        UserDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
    }

    /*@GetMapping("/user/{}")
    public ResponseEntity<?> getUserById(@RequestParam(name ="id,name") String id) {

        return ResponseEntity.ok(result);
    }*/

    @PostMapping ("/user")
    public ResponseEntity<?> createUser(){
        return null;
    }

    @PutMapping("/user?id")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("/user?id")
    public ResponseEntity<?> deleteUser(){
        return null;
    }

}