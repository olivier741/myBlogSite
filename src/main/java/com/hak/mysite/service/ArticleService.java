package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.base.service.BaseService;
import com.hak.mysite.model.TContents;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TContentsVo;
import org.springframework.data.domain.Pageable;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public interface ArticleService extends BaseService {

    PageInfo<TContentsVo> getTContentsList(Pageable pageable , LoginUser loginUser) throws Exception;

    int insertTContents(TContents tContents) throws Exception;

    int updateTContents(TContents tContents) throws Exception;

    TContents getContentsById(int id) throws Exception;

    int deleteTContentsById(int id) throws Exception;

}
