package com.example.iottrainning.service;

import com.example.iottrainning.entity.User;
import com.example.iottrainning.model.dto.UserDto;
import com.example.iottrainning.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Thai","01213132","thai@gmail.com","123456",0));
        users.add(new User(2,"Lam","5345334","lam@gmail.com","123456",1));
        users.add(new User(3,"Linh","95873893","linh@gmail.com","123456",1));
    }

    @Override
    public List<UserDto> getlistUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user: users)
        {
            result.add(UserMapper.toUserDto((user)));
        }
        return result;
    }

   @Override
    public UserDto getUserById(int id)
    {
        for (User user:users)
        {
            if (user.getUuid() == id)
            {
                return UserMapper.toUserDto(user);
            }
        }
        return null;
    }

    /*@Override
    public UserDto getUserById(String id)
    {
        for (User user:users)
        {
            if (user.getUuid() == id)
            {
                return UserMapper.toUserDto(user);
            }
        }
        return null;
    }*/
}
