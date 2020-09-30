package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 角色表
 * @author hak 2020-09-14
 */
@ApiModel("角色表")
public class TRoles {
    /**
     * 角色id
     */
    @ApiModelProperty("角色id")
    private Integer rId;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String roleName;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date created;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date modified;

    /**
     * 角色id
     * @return r_id 角色id
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * 角色id
     * @param rId 角色id
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * 名称
     * @return role_name 名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 名称
     * @param roleName 名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 创建时间
     * @return created 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
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
}