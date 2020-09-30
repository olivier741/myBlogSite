package com.hak.mysite.mapper.vo;


import org.apache.ibatis.annotations.Param;

public interface CommonMapper {

    Integer getTableKey( String tableKey, String tableName);

}