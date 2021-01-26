package com.mybatis.mapper;

import com.mybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserMapper
 * DATE: 2021/1/27
 * TIME: 0:20
 * JDK 11
 */
@Repository
public interface UserMapper {

    User selectUserById(Integer id);

}
