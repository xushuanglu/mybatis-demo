package com.mybatis.controller;/**
 * Created with IntelliJ IDEA
 * USER:xushuanglu
 * CLASSNAME: UserController
 * DATE: 2021/1/27
 * TIME: 0:18
 * JDK 11
 */

import com.mybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:18
 * @Version v1.0
 **/
@Api("用户管理api")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("根据id查询用户信息")
    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable Integer id) {
        return userService.getUserById(id).toString();
    }

    /*@ApiOperation("保存用户")
    @PostMapping("/saveUser")
    public JSONObject saveUser(@RequestBody User userInfo){
        userApiService.saveUser(userInfo);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("message",null);
        return jsonObject;
    }*/
}
