package com.aaa.github.vo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class LoginVo implements Serializable {
    @NotNull(message = "对不起账号不能为空")
    @Length(min =2, max =5, message="对不起，账号应该在6-18位")
    private String username;


    @NotNull(message = "对不起密码不能为空")
    @Length(min =2, max =5, message="对不起，密码应该在6-18位")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
