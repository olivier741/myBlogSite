package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TMenuMapper;
import com.hak.mysite.mapper.vo.TMenuVoMapper;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TMenuExample;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import com.hak.mysite.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl implements MenuService {

    @Autowired
    private TMenuMapper tMenuMapper;

    @Autowired
    private TMenuVoMapper tMenuVoMapper;

    @Override
    public PageInfo<TMenu> getTMenuList(Pageable pageable) throws Exception {
        super.queryInit(pageable);
        TMenuExample example = new TMenuExample();
        TMenuExample.Criteria criteria = example.createCriteria();
        List<TMenu> list = tMenuMapper.selectByExample(example);
        return super.getPageInfo(list);
    }

    @Override
    public List<TMenuAndRoleVo> getAllTMenuAndRoleList()   {

        List<TMenuAndRoleVo> list = tMenuVoMapper.selectAllTMenuAndRoleList();
        return list;
    }

    @Override
    public List<TMenuAndRoleVo> getTMenuAndRoleListByRoleName(String roleName) {
        return tMenuVoMapper.selectTMenuAndRoleListByRoleName(roleName);
    }

}
