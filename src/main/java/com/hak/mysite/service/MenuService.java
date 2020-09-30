package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
public interface MenuService {

    PageInfo<TMenu> getTMenuList(Pageable pageable) throws Exception;

    List<TMenuAndRoleVo> getAllTMenuAndRoleList() ;

    List<TMenuAndRoleVo> getTMenuAndRoleListByRoleName(String roleName) ;


}
