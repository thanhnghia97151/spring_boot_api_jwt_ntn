package com.example.spring_boot_jwt_ntn.service;

import com.example.spring_boot_jwt_ntn.entity.User;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public interface UserService {
    public Boolean saveAndFlush(User user);
    public User getUser(String name);
}
