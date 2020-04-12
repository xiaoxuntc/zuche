package com.athm.zuche.dao;

import com.athm.zuche.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: zuche
 * @description:
 * @author: Sean
 * @create: 2020-04-11 19:42
 **/

@Mapper
public interface UserMapper {
    @Select("SELECT id,username,age,phone,email FROM USER WHERE AGE=#{age}")
    List<User> getUser(int age);
}

