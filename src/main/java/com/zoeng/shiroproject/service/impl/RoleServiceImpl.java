package com.zoeng.shiroproject.service.impl;

import com.zoeng.shiroproject.dao.RoleMapper;
import com.zoeng.shiroproject.entity.Role;
import com.zoeng.shiroproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUserId(Integer id) {
        return roleMapper.findRoleByUserId(id);
    }
}
