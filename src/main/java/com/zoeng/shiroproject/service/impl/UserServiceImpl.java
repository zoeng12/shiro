package com.zoeng.shiroproject.service.impl;

import com.zoeng.shiroproject.dao.UserMapper;
import com.zoeng.shiroproject.entity.User;
import com.zoeng.shiroproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }
}
