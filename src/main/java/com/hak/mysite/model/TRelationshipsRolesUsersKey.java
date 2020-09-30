package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 角色用户关系表
 * @author hak 2020-09-14
 */
@ApiModel("角色用户关系表")
public class TRelationshipsRolesUsersKey {
    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer uId;

    /**
     * 角色id
     */
    @ApiModelProperty("角色id")
    private Integer rId;

    /**
     * 用户id
     * @return u_id 用户id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 用户id
     * @param uId 用户id
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

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
}