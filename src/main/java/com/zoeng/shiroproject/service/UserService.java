package com.zoeng.shiroproject.service;

import com.zoeng.shiroproject.entity.User;

public interface UserService {
    public User findByAccount(String account);
}
