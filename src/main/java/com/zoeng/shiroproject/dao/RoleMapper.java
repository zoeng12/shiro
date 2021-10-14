package com.zoeng.shiroproject.dao;

import com.zoeng.shiroproject.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {
    List<Role> findRoleByUserId(@Param("userId") Integer userId);
}
