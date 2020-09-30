package com.hak.mysite.mapper.vo;

import com.hak.mysite.model.vo.LoginUser;

public interface LoginUserMapper {

    LoginUser selectLoginUserByUserName(String userName);


}