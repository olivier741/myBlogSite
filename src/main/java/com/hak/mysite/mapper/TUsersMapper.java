package com.hak.mysite.mapper;

import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer uId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TUsers record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TUsers record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TUsers> selectByExample(TUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TUsers selectByPrimaryKey(Integer uId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TUsers record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TUsers record);
}