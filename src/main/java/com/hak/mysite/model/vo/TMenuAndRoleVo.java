package com.hak.mysite.model.vo;

import com.hak.mysite.model.TRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 菜单和角色
 * @author hak 2020-08-25
 */
@ApiModel("菜单和角色")
@Data
public class TMenuAndRoleVo {

    /**
     * 角色集合
     */
    @ApiModelProperty("角色集合")
    List<TRoles> roleList;

    /**
     * 菜单id
     */
    @ApiModelProperty("菜单id")
    private Integer meId;

    /**
     * 菜单名称
     */
    @ApiModelProperty("菜单名称")
    private String menuName;

    /**
     * 菜单url
     */
    @ApiModelProperty("菜单url")
    private String menuUrl;

    /**
     * 上级id
     */
    @ApiModelProperty("上级id")
    private Integer parentId;

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
     * 图标
     */
    @ApiModelProperty("图标")
    private String menuImg;

}