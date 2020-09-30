package com.hak.mysite.mapper.vo;

import com.hak.mysite.model.vo.TRolesVo;

import java.util.List;

public interface TRolesVoMapper {

    List<TRolesVo> getMenuAndRoleListByRId(Integer rId);

    int insertRoleAndMenuBatch(List lit);

}