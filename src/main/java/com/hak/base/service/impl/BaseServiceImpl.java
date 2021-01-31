package com.hak.base.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hak.base.service.BaseService;
import com.hak.mysite.mapper.vo.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public class BaseServiceImpl implements BaseService {

    @Autowired
    CommonMapper commonMapper;


    public void queryInit(Pageable pageable)
    {
        int pageNum = pageable.getPageNumber();
        int pageSize = pageable.getPageSize();
        PageHelper.startPage((int)pageNum , pageSize);
    }

    public PageInfo getPageInfo(List list)
    {
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }


    /**
     * Generate primary key
     *
     * @param name
     * @Return java.lang.Integer
     * @Exception Exception
     * @author hak
     * @date 2020/9/11
     */
    @Override
    public Integer getTableKey(String name) throws Exception {
        String[] vale = name.split("\\.");
        String tableName = vale[0];
        String tableKey = vale[1];
        return commonMapper.getTableKey(tableKey,tableName);
    }
}
