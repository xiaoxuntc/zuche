package com.athm.zuche.service;

import com.athm.zuche.pojo.User;

import java.util.List;

/**
 * @program: zuche
 * @description:
 * @author: Sean
 * @create: 2020-04-11 20:09
 **/
public interface UserService {
    List<User> getUser(int age);
}
