package com.hak.base.service.impl;

import com.hak.base.service.CodeService;
import com.hak.mysite.mapper.TCodeMapper;
import com.hak.mysite.model.TCode;
import com.hak.mysite.model.TCodeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private TCodeMapper tCodeMapper;

    @Override
    public List<TCode> getCodeList(String code) throws Exception {
        TCodeExample example = new TCodeExample();
        TCodeExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);
        List<TCode> list = tCodeMapper.selectByExample(example);
        return list;
    }
}
