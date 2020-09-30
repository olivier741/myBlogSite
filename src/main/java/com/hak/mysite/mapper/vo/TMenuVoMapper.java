package com.hak.mysite.mapper.vo;

import com.hak.mysite.model.vo.TMenuAndRoleVo;

import java.util.List;

public interface TMenuVoMapper {

    List<TMenuAndRoleVo> selectAllTMenuAndRoleList( );

    List<TMenuAndRoleVo> selectTMenuAndRoleListByRoleName(String roleName);

    List<TMenuAndRoleVo> selectAllTMenuAndRoleListByRId(Integer rId);

}