package com.example.project1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 角色对应权限信息
 */
@Data
@AllArgsConstructor
public class Permissions {

    private String id;
    private String permissioinsName;

}
