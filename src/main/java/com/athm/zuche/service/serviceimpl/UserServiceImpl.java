package com.athm.zuche.service.serviceimpl;

import com.athm.zuche.dao.UserMapper;
import com.athm.zuche.pojo.User;
import com.athm.zuche.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: zuche
 * @description:
 * @author: Sean
 * @create: 2020-04-11 20:10
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(int age){
        return userMapper.getUser(age);
    }
}
