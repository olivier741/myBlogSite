package com.hak.mysite.service.impl;

import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TMenuMapper;
import com.hak.mysite.mapper.vo.TMenuVoMapper;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TMenuExample;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import com.hak.mysite.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
@Service
public class IndexServiceImp extends BaseServiceImpl implements IndexService {

    @Autowired
    TMenuMapper tMenuMapper;


    @Autowired
    TMenuVoMapper tMenuVoMapper;


    @Override
    public List<TMenuAndRoleVo> getTMenusList(LoginUser loginUser) throws Exception {

        List<TMenuAndRoleVo> list = tMenuVoMapper.selectTMenuAndRoleListByRoleName(loginUser.getRoleName());

        return list;
    }
}
