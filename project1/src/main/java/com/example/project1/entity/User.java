package com.example.project1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/***
 * 用户信息
 */
@Data
@AllArgsConstructor
public class User {

    private String id;
    private String userName;
    private String password;


    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;

}
