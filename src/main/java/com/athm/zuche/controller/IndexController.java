package com.athm.zuche.controller;

import com.athm.zuche.pojo.User;
import com.athm.zuche.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: zuche
 * @description:
 * @author: Sean
 * @create: 2020-04-11 19:00
 **/
@RestController
public class IndexController {

    @Autowired
    UserService userService;
    @GetMapping("/show")
    public List<User> getUser(Integer age){
        return userService.getUser(age);
    }

    @RequestMapping("/index")
    @ResponseBody
    public Map<String, String> index() {
        Map map = new HashMap<String, String>();
        map.put("北京", "北方城市");
        map.put("深圳", "南方城市");
        return map;
    }
}
