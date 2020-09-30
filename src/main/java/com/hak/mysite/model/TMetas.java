package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 标签表
 * @author hak 2020-09-14
 */
@ApiModel("标签表")
public class TMetas {
    /**
     * 标签id
     */
    @ApiModelProperty("标签id")
    private Integer mId;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty("类型")
    private String type;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date modified;

    /**
     * 
     */
    @ApiModelProperty("")
    private Integer parent;

    /**
     * 操作者
     */
    @ApiModelProperty("操作者")
    private Integer uId;

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

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 类型
     * @return type 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 修改时间
     * @return modified 修改时间
     */
    public Date getModified() {
        return modified;
    }

    /**
     * 修改时间
     * @param modified 修改时间
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return parent 
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 
     * @param parent 
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * 操作者
     * @return u_id 操作者
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 操作者
     * @param uId 操作者
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }
}