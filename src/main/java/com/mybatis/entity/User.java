package com.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName User
 * @Description TODO
 * @Auther xushu
 * @Date 2021/1/27
 * @Time 0:17
 * @Version v1.0
 **/
@ApiModel("用户")
public class User {

    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户名称")
    private String userName;
    @ApiModelProperty("用户密码")
    private String passWord;
    @ApiModelProperty("真实名称")
    private String realName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
