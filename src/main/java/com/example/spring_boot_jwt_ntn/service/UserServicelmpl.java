package com.example.spring_boot_jwt_ntn.service;

import com.example.spring_boot_jwt_ntn.entity.User;
import com.example.spring_boot_jwt_ntn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Boolean saveAndFlush(User user) {
        if(user !=null)
        {
            userRepository.saveAndFlush(user);
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String name) {
        return userRepository.findByUsername(name);
    }
}
