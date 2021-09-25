package com.example.spring_boot_jwt_ntn.repository;

import com.example.spring_boot_jwt_ntn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByUsername(String name);
}
