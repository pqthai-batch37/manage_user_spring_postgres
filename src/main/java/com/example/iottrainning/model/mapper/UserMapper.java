package com.example.iottrainning.model.mapper;

import com.example.iottrainning.entity.User;
import com.example.iottrainning.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user)
    {
        UserDto tmp = new UserDto();
        tmp.setUuid(user.getUuid());
        tmp.setName(user.getName());
        tmp.setPhone(user.getPhone());
        tmp.setEmail(user.getEmail());
        tmp.setRole_id(user.getRole_id());

        return tmp;
    }
}
