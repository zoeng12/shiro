package com.zoeng.shiroproject.service;

import java.util.List;

public interface PermissionService {
    public List<String> findByRoleId(List<Integer> roleIds);
}
