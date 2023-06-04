package com.aaa.github.service;

import com.aaa.github.vo.LoginVo;
import com.aaa.song.admindto.SysEmpInfo;

public interface LoginService {
    SysEmpInfo login(LoginVo loginVO);
}
