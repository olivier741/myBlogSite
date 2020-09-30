package com.hak.mysite.mapper.vo;


import com.hak.mysite.model.vo.TContentsVo;

import java.util.List;

public interface TContentsVoMapper {

    List<TContentsVo> getAllContentsListByCId(Integer cId);

}