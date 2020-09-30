package com.hak.mysite.mapper;

import com.hak.mysite.model.TContents;
import com.hak.mysite.model.TContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TContentsMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TContents record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TContents record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TContents> selectByExampleWithBLOBs(TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TContents> selectByExample(TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TContents selectByPrimaryKey(Integer cId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TContents record, @Param("example") TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleWithBLOBs(@Param("record") TContents record, @Param("example") TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TContents record, @Param("example") TContentsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TContents record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeyWithBLOBs(TContents record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TContents record);
}