package com.hak.mysite.service;

import com.hak.base.service.BaseService;
import com.hak.mysite.model.TContents;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/7
 */
public interface HomeService extends BaseService {

    List<TContents> getAllContentsList() throws Exception;

    TContents getContentsById(int cid) throws Exception;
}
