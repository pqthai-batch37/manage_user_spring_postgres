package com.example.iottrainning.service;

import com.example.iottrainning.entity.User;
import com.example.iottrainning.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List <UserDto> getlistUser();


    public UserDto getUserById(int id);

   /* public UserDto getUserById(String id);*/



}



