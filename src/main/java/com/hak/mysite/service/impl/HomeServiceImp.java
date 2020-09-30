package com.hak.mysite.service.impl;

import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TContentsMapper;
import com.hak.mysite.model.TContents;
import com.hak.mysite.model.TContentsExample;
import com.hak.mysite.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
@Service
public class HomeServiceImp extends BaseServiceImpl implements HomeService  {

    @Autowired
    TContentsMapper tContentsMapper;

    @Override
    public List<TContents> getAllContentsList() throws Exception {

        TContentsExample tContentsExample = new TContentsExample();
        TContentsExample.Criteria criteria =tContentsExample.createCriteria();
        criteria.andStatusEqualTo(1);
        List list = tContentsMapper.selectByExample(tContentsExample);
        return list;
    }

    @Override
    public TContents getContentsById(int cid) throws Exception {
        TContents tContents = tContentsMapper.selectByPrimaryKey(cid);
        return tContents;
    }
}
