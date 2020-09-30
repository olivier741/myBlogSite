package com.hak.mysite.mapper;

import com.hak.mysite.model.TMetas;
import com.hak.mysite.model.TMetasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMetasMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer mId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TMetas record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TMetas record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TMetas> selectByExample(TMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TMetas selectByPrimaryKey(Integer mId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TMetas record, @Param("example") TMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TMetas record, @Param("example") TMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TMetas record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TMetas record);
}