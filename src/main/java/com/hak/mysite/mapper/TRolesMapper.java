package com.hak.mysite.mapper;

import com.hak.mysite.model.TRoles;
import com.hak.mysite.model.TRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolesMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TRolesExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TRolesExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer rId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TRoles record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TRoles record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TRoles> selectByExample(TRolesExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TRoles selectByPrimaryKey(Integer rId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TRoles record, @Param("example") TRolesExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TRoles record, @Param("example") TRolesExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TRoles record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TRoles record);
}