package com.hak.mysite.mapper;

import com.hak.mysite.model.TLogs;
import com.hak.mysite.model.TLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogsMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TLogsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TLogsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TLogs record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TLogs record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TLogs> selectByExample(TLogsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TLogs selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TLogs record, @Param("example") TLogsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TLogs record, @Param("example") TLogsExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TLogs record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TLogs record);
}