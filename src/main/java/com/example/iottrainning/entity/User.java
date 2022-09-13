package com.example.iottrainning.entity;

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
public class User {

    private int uuid;

    private String name;

    private String phone;

    private String email;

    private String password;

    private int role_id;

}
