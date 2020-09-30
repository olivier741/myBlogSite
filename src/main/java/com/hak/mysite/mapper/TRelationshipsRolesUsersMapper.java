package com.hak.mysite.mapper;

import com.hak.mysite.model.TRelationshipsRolesUsersExample;
import com.hak.mysite.model.TRelationshipsRolesUsersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationshipsRolesUsersMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TRelationshipsRolesUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TRelationshipsRolesUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(TRelationshipsRolesUsersKey key);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TRelationshipsRolesUsersKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TRelationshipsRolesUsersKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TRelationshipsRolesUsersKey> selectByExample(TRelationshipsRolesUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TRelationshipsRolesUsersKey record, @Param("example") TRelationshipsRolesUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TRelationshipsRolesUsersKey record, @Param("example") TRelationshipsRolesUsersExample example);
}