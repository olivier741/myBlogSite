package com.hak.config.security;

import com.hak.mysite.mapper.TUsersMapper;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.TUsersExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/** 废弃
 * @author hak
 * @description
 * @date 2020/8/12
 */
public class CustomUserService implements UserDetailsService {

    @Autowired
    TUsersMapper tUsersMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TUsersExample tUsersExample = new TUsersExample();
        TUsersExample.Criteria criteria = tUsersExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<TUsers> list = tUsersMapper.selectByExample(tUsersExample);
        logger.info("用户名："+username);
        if(list.size() == 0){
            throw new UsernameNotFoundException("用户名不存在");
            // throw new BadCredentialsException("帐号不存在，请重新输入");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
/*        for(SysRole role:user.getRoles())
        {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
            System.out.println(role.getName());
        }*/

        authorities.add(new SimpleGrantedAuthority("ROLE_admin"));

        return new org.springframework.security.core.userdetails.User(list.get(0).getUserName(),
                        list.get(0).getPassWord(), authorities);

    }
}
