package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
  * Role user relationship table
  * @author hak 2020-09-14
  */
@ApiModel("Role User Relationship Table")
public class TRelationshipsRolesUsersKey {
     /**
      * User id
      */
     @ApiModelProperty("User id")
     private Integer uId;

     /**
      * Role id
      */
     @ApiModelProperty("role id")
     private Integer rId;

     /**
      * User id
      * @return u_id user id
      */
     public Integer getuId() {
         return uId;
     }

     /**
      * User id
      * @param uId user id
      */
     public void setuId(Integer uId) {
         this.uId = uId;
     }

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
}