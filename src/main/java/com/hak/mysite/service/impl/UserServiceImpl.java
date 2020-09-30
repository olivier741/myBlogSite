package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TRelationshipsRolesUsersMapper;
import com.hak.mysite.mapper.TUsersMapper;
import com.hak.mysite.mapper.vo.TUsersVoMapper;
import com.hak.mysite.model.TRelationshipsRolesUsersExample;
import com.hak.mysite.model.TRelationshipsRolesUsersKey;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.TUsersExample;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TUsersVo;
import com.hak.mysite.service.UserService;
import com.hak.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Autowired
    private TUsersMapper tUsersMapper;

    @Autowired
    private TUsersVoMapper tUsersVoMapper;

    @Autowired
    private TRelationshipsRolesUsersMapper tRelationshipsRolesUsersMapper;

    @Override
    public PageInfo<TUsers> getTUsersList(Pageable pageable) throws Exception {
        super.queryInit(pageable);
        List list = tUsersVoMapper.getAllUserList();
        return super.getPageInfo(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addTUsers(TUsersVo tUsersVo) throws Exception {
        tUsersVo.setPassWord(MD5Util.encode(tUsersVo.getPassWord()));
        TRelationshipsRolesUsersKey ru = new TRelationshipsRolesUsersKey();
        Integer uId = this.getTableKey("t_users.u_id");
        tUsersVo.setuId(uId);
        tUsersMapper.insert(tUsersVo);
        ru.setrId(tUsersVo.getRId());
        ru.setuId(tUsersVo.getuId());
        return tRelationshipsRolesUsersMapper.insert(ru);
    }

    @Override
    public int saveTUsers(TUsersVo tUsersVo) throws Exception {
        TUsersExample example = new TUsersExample();
        TUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUIdEqualTo(tUsersVo.getuId());
        tUsersMapper.updateByPrimaryKeySelective(tUsersVo);
        TRelationshipsRolesUsersExample ex = new TRelationshipsRolesUsersExample();
        TRelationshipsRolesUsersExample.Criteria cr = ex.createCriteria();
        cr.andUIdEqualTo(tUsersVo.getuId());
        TRelationshipsRolesUsersKey trru = new TRelationshipsRolesUsersKey();
        trru.setrId(tUsersVo.getRId());
        int i = tRelationshipsRolesUsersMapper.updateByExampleSelective(trru,ex);
        return i;
    }

    @Override
    public TUsersVo getUserInfo(Integer uId) throws Exception {

        return tUsersVoMapper.getUserListByUId(uId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteTUsersById(int id) throws Exception {
        TUsersExample example = new TUsersExample();
        TUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUIdEqualTo(id);

        TRelationshipsRolesUsersExample ruExampl = new TRelationshipsRolesUsersExample();
        TRelationshipsRolesUsersExample.Criteria ruExamplCriteria = ruExampl.createCriteria();
        ruExamplCriteria.andUIdEqualTo(id);
        tRelationshipsRolesUsersMapper.deleteByExample(ruExampl);

        return tUsersMapper.deleteByExample(example);
    }

    @Override
    public long checkUserName(TUsers tUsers) throws Exception {
        TUsersExample example = new TUsersExample();
        TUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(tUsers.getUserName());
        return tUsersMapper.countByExample(example);
    }

    @Override
    public int editPwd(LoginUser loginUser, String newPassWord) throws Exception {
        TUsers tUsers = new TUsers();
        tUsers.setPassWord(newPassWord);
        TUsersExample example = new TUsersExample();
        TUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(loginUser.getUsername());
        return tUsersMapper.updateByExampleSelective(tUsers,example);
    }

}
