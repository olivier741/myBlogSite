package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.mysite.model.TRoles;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TRolesVo;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
public interface RoleService {

    PageInfo<TRoles> getAllRoleList(Pageable pageable) throws Exception;

    List<TRoles> selectList( ) throws Exception;

    int addRole(TRoles tRoles) throws Exception;

    Map<String,List> getMenuAndRoleByRId(Integer rId) throws Exception;

    int updateMenuByRId(Integer rId,List<Map> list) throws Exception;

    Boolean checkDeleteRoleByRId(Integer rId) throws Exception;

    int deleteRoleByRId(Integer rId) throws Exception;

}
