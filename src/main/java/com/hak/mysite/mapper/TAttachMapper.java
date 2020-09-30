package com.hak.mysite.mapper;

import com.hak.mysite.model.TAttach;
import com.hak.mysite.model.TAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAttachMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TAttachExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TAttachExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer aId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TAttach record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TAttach record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TAttach> selectByExample(TAttachExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TAttach selectByPrimaryKey(Integer aId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TAttach record, @Param("example") TAttachExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TAttach record, @Param("example") TAttachExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TAttach record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TAttach record);
}