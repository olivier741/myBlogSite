package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.BaseService;
import com.hak.mysite.model.TComments;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public interface CommentService extends BaseService {

    PageInfo<TComments> getTCommentsList(Pageable pageable,String author, String content) throws Exception;

    TComments getCommentsById(int id) throws Exception;

    int deleteTCommentById(int id) throws Exception;

    int batchDeleteTComment(List idList) throws Exception;

}
