package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Role table
 * @author hak 2020-09-14
 */
@ApiModel("Character table")
public class TRoles {
    /**
     * Role id
     */
    @ApiModelProperty("role id")
    private Integer rId;

    /**
     * Name
     */
    @ApiModelProperty("Name")
    private String roleName;

    /**
     * Creation time
     */
    @ApiModelProperty("Creation Time")
    private Date created;

    /**
     * Change the time
     */
    @ApiModelProperty("modification time")
    private Date modified;

    /**
     * Role id
     * @return r_id role id
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * Role id
     * @param rId role id
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * Name
     * @return role_name name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Name
     * @param roleName name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null? null: roleName.trim();
    }

    /**
     * Creation time
     * @return created creation time
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Creation time
     * @param created creation time
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Change the time
     * @return modified modification time
     */
    public Date getModified() {
        return modified;
    }

    /**
     * Change the time
     * @param modified modification time
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}