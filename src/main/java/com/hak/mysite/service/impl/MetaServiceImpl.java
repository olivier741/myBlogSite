package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.BaseService;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TMetasMapper;
import com.hak.mysite.model.TMetas;
import com.hak.mysite.model.TMetasExample;
import com.hak.mysite.service.MetaService;
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
public class MetaServiceImpl extends BaseServiceImpl implements MetaService {

    @Autowired
    private TMetasMapper tMetasMapper;

    @Override
    public PageInfo<TMetas> getMetaList(Pageable pageable) throws Exception {
        super.queryInit(pageable);
        TMetasExample example = new TMetasExample();
        TMetasExample.Criteria criteria = example.createCriteria();
        List list = tMetasMapper.selectByExample(example);
        return super.getPageInfo(list);
    }

    @Override
    public List<TMetas> getCategorieList() throws Exception {
        TMetasExample example = new TMetasExample();
        TMetasExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo("1");
        List list = tMetasMapper.selectByExample(example);
        return list;
    }

    @Override
    public int deleteMetaById(int id) throws Exception {
        TMetasExample example = new TMetasExample();
        TMetasExample.Criteria criteria = example.createCriteria();
        criteria.andMIdEqualTo(id);

        return tMetasMapper.deleteByExample(example);
    }
}
