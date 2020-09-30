package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.*;
import com.hak.mysite.mapper.vo.TMenuVoMapper;
import com.hak.mysite.mapper.vo.TRolesVoMapper;
import com.hak.mysite.model.*;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TRolesVo;
import com.hak.mysite.service.RoleService;
import com.hak.mysite.service.UserService;
import com.hak.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl implements RoleService {

    @Autowired
    private TRolesMapper tRolesMapper;

    @Autowired
    private TRolesVoMapper tRolesVoMapper;

    @Autowired
    private TRelationshipsRolesMenuMapper tRelationshipsRolesMenuMapper;

    @Autowired
    private TRelationshipsRolesUsersMapper tRelationshipsRolesUsersMapper;

    @Override
    public PageInfo<TRoles> getAllRoleList(Pageable pageable) throws Exception {
        super.queryInit(pageable);
        TRolesExample example = new TRolesExample();
        TRolesExample.Criteria criteria = example.createCriteria();
        List list = tRolesMapper.selectByExample(example);
        return super.getPageInfo(list);
    }

    @Override
    public List<TRoles> selectList() throws Exception {

        TRolesExample example = new TRolesExample();
        TRolesExample.Criteria criteria = example.createCriteria();
        criteria.andRIdIsNotNull();

        return tRolesMapper.selectByExample(example);
    }

    @Override
    public int addRole(TRoles tRoles) throws Exception {
        tRoles.setCreated(new Date());
        return tRolesMapper.insert(tRoles);
    }

    @Override
    public Map<String,List> getMenuAndRoleByRId(Integer rId) throws Exception {

        List<TRolesVo> allList = tRolesVoMapper.getMenuAndRoleListByRId(rId);
        List checkList = new ArrayList();
        int i ;
        for ( i = 0; i < allList.size(); i++) {
            if (allList.get(i).getMenuChecked()){
                checkList.add(allList.get(i).getMeId());
            }
        }
        Map<String,List> map = new HashMap<String,List>(16);
        map.put("all",allList);
        map.put("select",checkList);
        return map;
    }

    @Override
    public int updateMenuByRId(Integer rId, List<Map> list) throws Exception {
        TRelationshipsRolesMenuExample example = new TRelationshipsRolesMenuExample();
        TRelationshipsRolesMenuExample.Criteria criteria = example.createCriteria();
        criteria.andRIdEqualTo(rId);
        tRelationshipsRolesMenuMapper.deleteByExample(example);
        List<TRelationshipsRolesMenuKey> li = new ArrayList<>();
        TRelationshipsRolesMenuKey rm ;
        for (int i = 0; i < list.size(); i++) {
            rm = new TRelationshipsRolesMenuKey();
            rm.setMeId(Integer.valueOf(list.get(i).get("value").toString()));
            rm.setrId(rId);
            li.add(rm);
        }

        int i = tRolesVoMapper.insertRoleAndMenuBatch(li);

        return i;
    }

    @Override
    public Boolean checkDeleteRoleByRId(Integer rId) throws Exception {
        TRelationshipsRolesUsersExample example = new TRelationshipsRolesUsersExample();
        TRelationshipsRolesUsersExample.Criteria criteria = example.createCriteria();
        criteria.andRIdEqualTo(rId);
        Long i = tRelationshipsRolesUsersMapper.countByExample(example);
        if (i != 0){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteRoleByRId(Integer rId) throws Exception {
        TRelationshipsRolesUsersExample example = new TRelationshipsRolesUsersExample();
        TRelationshipsRolesUsersExample.Criteria criteria = example.createCriteria();
        criteria.andRIdEqualTo(rId);
        tRelationshipsRolesUsersMapper.deleteByExample(example);
        int i = tRolesMapper.deleteByPrimaryKey(rId);
        return i;
    }
}
