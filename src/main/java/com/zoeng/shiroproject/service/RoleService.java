package com.zoeng.shiroproject.service;

import com.zoeng.shiroproject.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> findRoleByUserId(Integer id);
}
