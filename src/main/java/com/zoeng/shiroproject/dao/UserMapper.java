package com.zoeng.shiroproject.dao;

import com.zoeng.shiroproject.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User findByAccount(@Param("account") String account);
}
