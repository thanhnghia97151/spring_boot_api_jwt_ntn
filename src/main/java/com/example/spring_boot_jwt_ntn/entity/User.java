package com.example.spring_boot_jwt_ntn.entity;



import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
@Setter
@Getter
public class User extends BaseEntity{
    private String username;

    private String password;


}
