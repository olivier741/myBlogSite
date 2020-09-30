package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 角色菜单关系表
 * @author hak 2020-09-14
 */
@ApiModel("角色菜单关系表")
public class TRelationshipsRolesMenuKey {
    /**
     * 角色id
     */
    @ApiModelProperty("角色id")
    private Integer rId;

    /**
     * 菜单id
     */
    @ApiModelProperty("菜单id")
    private Integer meId;

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
     * 菜单id
     * @return me_id 菜单id
     */
    public Integer getMeId() {
        return meId;
    }

    /**
     * 菜单id
     * @param meId 菜单id
     */
    public void setMeId(Integer meId) {
        this.meId = meId;
    }
}