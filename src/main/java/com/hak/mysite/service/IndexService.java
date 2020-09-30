package com.hak.mysite.service;

import com.hak.base.service.BaseService;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TMenuAndRoleVo;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public interface IndexService extends BaseService {

    List<TMenuAndRoleVo> getTMenusList(LoginUser loginUser) throws Exception;

}
