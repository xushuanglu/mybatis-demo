package com.mybatis.service;

import com.mybatis.entity.User;

/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserService
 * DATE: 2021/1/27
 * TIME: 0:19
 * JDK 11
 */
public interface UserService {

    User getUserById(Integer id);

}
