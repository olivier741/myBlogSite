package com.hak.mysite.mapper;

import com.hak.mysite.model.TRelationshipsContentsMetasExample;
import com.hak.mysite.model.TRelationshipsContentsMetasKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationshipsContentsMetasMapper {
    /**
     *
     * @mbg.generated 2020-09-14
     */
    long countByExample(TRelationshipsContentsMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByExample(TRelationshipsContentsMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int deleteByPrimaryKey(TRelationshipsContentsMetasKey key);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insert(TRelationshipsContentsMetasKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int insertSelective(TRelationshipsContentsMetasKey record);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    List<TRelationshipsContentsMetasKey> selectByExample(TRelationshipsContentsMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExampleSelective(@Param("record") TRelationshipsContentsMetasKey record, @Param("example") TRelationshipsContentsMetasExample example);

    /**
     *
     * @mbg.generated 2020-09-14
     */
    int updateByExample(@Param("record") TRelationshipsContentsMetasKey record, @Param("example") TRelationshipsContentsMetasExample example);
}