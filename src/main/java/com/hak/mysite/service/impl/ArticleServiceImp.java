package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TContentsMapper;
import com.hak.mysite.mapper.TRelationshipsContentsMetasMapper;
import com.hak.mysite.mapper.vo.TContentsVoMapper;
import com.hak.mysite.model.TContents;
import com.hak.mysite.model.TContentsExample;
import com.hak.mysite.model.TRelationshipsContentsMetasExample;
import com.hak.mysite.model.TRelationshipsContentsMetasKey;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TContentsVo;
import com.hak.mysite.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
@Service
public class ArticleServiceImp extends BaseServiceImpl implements ArticleService {

    @Autowired
    TContentsMapper tContentsMapper;

    @Autowired
    TContentsVoMapper tContentsVoMapper;

    @Autowired
    TRelationshipsContentsMetasMapper tRelationshipsContentsMetasMapper;

    @Override
    public PageInfo<TContentsVo> getTContentsList(Pageable pageable , LoginUser loginUser) throws Exception {
        super.queryInit(pageable);
        List<TContentsVo>  list = tContentsVoMapper.getAllContentsListByCId(loginUser.getUId());
        return super.getPageInfo(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertTContents(TContents tContents) throws Exception {
        Integer cId = this.getTableKey("t_contents.c_id");
        tContents.setcId(cId);
        tContentsMapper.insert(tContents);

        TRelationshipsContentsMetasKey cm = new TRelationshipsContentsMetasKey();
        cm.setcId(cId);
        cm.setmId(tContents.getCategories());
        int i = tRelationshipsContentsMetasMapper.insert(cm);

        return i ;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateTContents(TContents tContents) throws Exception {
        TContentsExample example = new TContentsExample();
        TContentsExample.Criteria criteria = example.createCriteria();
        criteria.andCIdEqualTo(tContents.getcId());

        TRelationshipsContentsMetasKey cm = new TRelationshipsContentsMetasKey();
        cm.setcId(tContents.getcId());
        cm.setmId(tContents.getCategories());
        TRelationshipsContentsMetasExample exp = new TRelationshipsContentsMetasExample();
        TRelationshipsContentsMetasExample.Criteria cr = exp.createCriteria();
        cr.andCIdEqualTo(tContents.getcId());
        tRelationshipsContentsMetasMapper.updateByExampleSelective(cm,exp);

        return tContentsMapper.updateByExampleSelective(tContents,example);
    }

    @Override
    public TContents getContentsById(int id) throws Exception {

        return tContentsMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteTContentsById(int id) throws Exception {
        TRelationshipsContentsMetasExample exp = new TRelationshipsContentsMetasExample();
        TRelationshipsContentsMetasExample.Criteria cr = exp.createCriteria();
        cr.andCIdEqualTo(id);
        tRelationshipsContentsMetasMapper.deleteByExample(exp);
        return tContentsMapper.deleteByPrimaryKey(id);
    }
}
