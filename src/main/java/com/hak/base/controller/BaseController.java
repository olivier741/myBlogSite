package com.hak.base.controller;

import com.hak.mysite.mapper.vo.LoginUserMapper;
import com.hak.mysite.model.vo.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public class BaseController {

    @Autowired
    private LoginUserMapper loginUserMapper;

    public LoginUser getLoginInfo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser)authentication.getPrincipal();
        //LoginUser loginUser = loginUserMapper.selectLoginUserByUserName(authentication.getName());
        return loginUser;
    }



}
