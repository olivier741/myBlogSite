package com.hak.mysite.mapper;

import com.hak.mysite.model.TComments;
import com.hak.mysite.model.TCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommentsMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer coId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TComments record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TComments record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TComments> selectByExampleWithBLOBs(TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TComments> selectByExample(TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TComments selectByPrimaryKey(Integer coId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TComments record, @Param("example") TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleWithBLOBs(@Param("record") TComments record, @Param("example") TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TComments record, @Param("example") TCommentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TComments record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeyWithBLOBs(TComments record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TComments record);
}