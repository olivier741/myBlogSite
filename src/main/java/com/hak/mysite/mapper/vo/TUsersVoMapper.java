package com.hak.mysite.mapper.vo;

import com.hak.mysite.model.vo.TUsersVo;

import java.util.List;

public interface TUsersVoMapper {

    List<TUsersVo> getAllUserList();

    TUsersVo getUserListByUId(Integer uId);

}