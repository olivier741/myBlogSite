package com.hak.mysite.model.vo;

import com.hak.mysite.model.TRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 角色拓展类
 * @author hak 2020-09-14
 */
@ApiModel("角色拓展类")
@Data
public class TRolesVo extends TRoles {

    private String menuName;

    private Integer meId;

    private Boolean menuChecked;

    private List checkedList;

}