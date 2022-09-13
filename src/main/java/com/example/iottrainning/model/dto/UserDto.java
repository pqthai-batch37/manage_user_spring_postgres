package com.example.iottrainning.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserDto {
    private int uuid;

    private String name;

    private String phone;

    private String email;

    private int role_id;
}


