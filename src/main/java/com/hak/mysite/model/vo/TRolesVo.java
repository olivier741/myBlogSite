package com.hak.mysite.model.vo;

import com.hak.mysite.model.TRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
  * Role expansion
  * @author hak 2020-09-14
  */
@ApiModel("Character Expansion Class")
@Data
public class TRolesVo extends TRoles {

     private String menuName;

     private Integer meId;

     private Boolean menuChecked;

     private List checkedList;

}