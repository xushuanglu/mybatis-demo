package com.mybatis.controller;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserController
 * DATE: 2021/1/27
 * TIME: 0:18
 * JDK 11
 */

import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:18
 * @Version v1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable Integer id) {
        return userService.getUserById(id).toString();
    }
}
