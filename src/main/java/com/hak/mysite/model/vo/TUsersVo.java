package com.hak.mysite.model.vo;

import com.hak.mysite.model.TUsers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
  * User expansion
  * @author hak 2020-09-10
  */
@ApiModel("User Extension Class")
@Data
public class TUsersVo extends TUsers {

     private Integer rId;

     private String roleName;

}