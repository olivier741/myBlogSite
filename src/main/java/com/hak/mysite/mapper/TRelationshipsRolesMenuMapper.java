package com.hak.mysite.mapper;

import com.hak.mysite.model.TRelationshipsRolesMenuExample;
import com.hak.mysite.model.TRelationshipsRolesMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationshipsRolesMenuMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TRelationshipsRolesMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TRelationshipsRolesMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(TRelationshipsRolesMenuKey key);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TRelationshipsRolesMenuKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TRelationshipsRolesMenuKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TRelationshipsRolesMenuKey> selectByExample(TRelationshipsRolesMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TRelationshipsRolesMenuKey record, @Param("example") TRelationshipsRolesMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TRelationshipsRolesMenuKey record, @Param("example") TRelationshipsRolesMenuExample example);
}