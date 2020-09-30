package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 文章标签关系表
 * @author hak 2020-09-14
 */
@ApiModel("文章标签关系表")
public class TRelationshipsContentsMetasKey {
    /**
     * 文章id
     */
    @ApiModelProperty("文章id")
    private Integer cId;

    /**
     * 标签id
     */
    @ApiModelProperty("标签id")
    private Integer mId;

    /**
     * 文章id
     * @return c_id 文章id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 文章id
     * @param cId 文章id
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 标签id
     * @return m_id 标签id
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * 标签id
     * @param mId 标签id
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }
}