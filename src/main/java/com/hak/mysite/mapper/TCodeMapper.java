package com.hak.mysite.mapper;

import com.hak.mysite.model.TCode;
import com.hak.mysite.model.TCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCodeMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TCodeExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TCodeExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TCode record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TCode record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TCode> selectByExample(TCodeExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TCode selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TCode record, @Param("example") TCodeExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TCode record, @Param("example") TCodeExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TCode record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TCode record);
}