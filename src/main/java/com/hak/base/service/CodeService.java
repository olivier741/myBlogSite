package com.hak.base.service;

import com.hak.mysite.model.TCode;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
public interface CodeService {

    List<TCode> getCodeList(String code) throws Exception;

}
