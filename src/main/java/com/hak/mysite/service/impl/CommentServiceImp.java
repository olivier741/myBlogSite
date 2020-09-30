package com.hak.mysite.service.impl;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.impl.BaseServiceImpl;
import com.hak.mysite.mapper.TCommentsMapper;
import com.hak.mysite.model.TComments;
import com.hak.mysite.model.TCommentsExample;
import com.hak.mysite.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
@Service
public class CommentServiceImp extends BaseServiceImpl implements CommentService {

    @Autowired
    TCommentsMapper tCommentsMapper;


    @Override
    public PageInfo<TComments> getTCommentsList(Pageable pageable,String author ,String content) throws Exception {
        super.queryInit(pageable);
        TCommentsExample example = new TCommentsExample();
        TCommentsExample.Criteria criteria = example.createCriteria();
        List<TComments>  list = tCommentsMapper.selectByExampleWithBLOBs(example);

        return super.getPageInfo(list);
    }

    @Override
    public TComments getCommentsById(int id) throws Exception {

        return tCommentsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteTCommentById(int id) throws Exception {

        return tCommentsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int batchDeleteTComment(List idList) throws Exception {
        TCommentsExample example = new TCommentsExample();
        TCommentsExample.Criteria criteria = example.createCriteria();
        criteria.andCoIdIn(idList);

        return tCommentsMapper.deleteByExample(example);
    }
}
