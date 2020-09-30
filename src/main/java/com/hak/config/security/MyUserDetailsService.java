package com.hak.config.security;

import com.hak.mysite.mapper.vo.LoginUserMapper;
import com.hak.mysite.model.vo.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/26
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUser loginUser = loginUserMapper.selectLoginUserByUserName(username);
        if(loginUser == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return  loginUser;
    }
}
