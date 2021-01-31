package com.hak.mysite.model.vo;

import com.hak.mysite.model.TRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Menu and roles
 * @author hak 2020-08-25
 */
@ApiModel("Menu and Role")
@Data
public class TMenuAndRoleVo {

    /**
     * Character collection
     */
    @ApiModelProperty("role collection")
    List<TRoles> roleList;

    /**
     * Menu id
     */
    @ApiModelProperty("menu id")
    private Integer meId;

    /**
     * Menu name
     */
    @ApiModelProperty("Menu Name")
    private String menuName;

    /**
     * Menu url
     */
    @ApiModelProperty("Menu url")
    private String menuUrl;

    /**
     * Superior id
     */
    @ApiModelProperty("upper id")
    private Integer parentId;

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
     * Icon
     */
    @ApiModelProperty("icon")
    private String menuImg;

}