package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.mysite.model.TMetas;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TUsersVo;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
public interface UserService {

    PageInfo<TUsers> getTUsersList(Pageable pageable) throws Exception;

    int addTUsers(TUsersVo tUsersVo) throws Exception;

    int saveTUsers(TUsersVo tUsersVo) throws Exception;

    TUsersVo getUserInfo(Integer uId) throws Exception;

    int deleteTUsersById(int id) throws Exception;

    long checkUserName(TUsers tUsers) throws Exception;

    int editPwd(LoginUser loginUser, String newPassWord) throws Exception;


}
