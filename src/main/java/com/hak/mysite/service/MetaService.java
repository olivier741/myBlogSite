package com.hak.mysite.service;

import com.github.pagehelper.PageInfo;
import com.hak.mysite.model.TComments;
import com.hak.mysite.model.TMetas;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
public interface MetaService {

    PageInfo<TMetas> getMetaList(Pageable pageable) throws Exception;

    List<TMetas> getCategorieList() throws Exception;

    int deleteMetaById(int id) throws Exception;

}
