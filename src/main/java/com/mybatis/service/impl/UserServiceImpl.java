package com.mybatis.service.impl;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserServiceIMpl
 * DATE: 2021/1/27
 * TIME: 0:21
 * JDK 11
 */

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceIMpl
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:21
 * @Version v1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
