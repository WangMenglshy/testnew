package com.aaa.github.controller;

import com.aaa.github.service.LoginService;
import com.aaa.github.vo.LoginVo;
import com.aaa.song.admindto.SysEmpInfo;
import com.aaa.song.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private LoginService loginService;



    @PostMapping("login")
//    对这个员工标上 @Valid 注解，表示我们对这个对象属性需要进行验证 跟 @validation 差不多 这个可以放到 成员变量上
    public Result login(@RequestBody @Valid LoginVo loginVO) {
        SysEmpInfo info = loginService.login(loginVO);
        System.out.println(info+"infoinfoinfoinfofinfo+AuthController");

        //生成jwt token 存储到redis
        //这个createToken 里面有很多信息    这个info 是 AuthServicelmpl 最下面的
        //用户输入的密码和数据库的密码进行比较成功的话 把这个info 返回回来这个 info 其实就是
        //song-admin 里的 getInfoByUsername 里面查询出来的所有信息 和账号密码
//        return Result.sucess(tokenService.createToken(info));
        return null;
    }


}
