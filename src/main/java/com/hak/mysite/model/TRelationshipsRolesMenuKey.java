package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
  * Role menu relationship table
  * @author hak 2020-09-14
  */
@ApiModel("Role Menu Relationship Table")
public class TRelationshipsRolesMenuKey {
     /**
      * Role id
      */
     @ApiModelProperty("role id")
     private Integer rId;

     /**
      * Menu id
      */
     @ApiModelProperty("menu id")
     private Integer meId;

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
      * Menu id
      * @return me_id menu id
      */
     public Integer getMeId() {
         return meId;
     }

     /**
      * Menu id
      * @param meId menu id
      */
     public void setMeId(Integer meId) {
         this.meId = meId;
     }
}