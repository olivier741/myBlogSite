package com.hak.mysite.mapper;

import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(Integer meId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TMenu record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TMenu record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TMenu> selectByExample(TMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    TMenu selectByPrimaryKey(Integer meId);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TMenu record, @Param("example") TMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TMenu record, @Param("example") TMenuExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKeySelective(TMenu record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByPrimaryKey(TMenu record);
}