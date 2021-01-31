package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
  * Article tag relationship table
  * @author hak 2020-09-14
  */
@ApiModel("Article Tag Relationship Table")
public class TRelationshipsContentsMetasKey {
     /**
      * Article id
      */
     @ApiModelProperty("Article id")
     private Integer cId;

     /**
      * Tag id
      */
     @ApiModelProperty("tag id")
     private Integer mId;

     /**
      * Article id
      * @return c_id article id
      */
     public Integer getcId() {
         return cId;
     }

     /**
      * Article id
      * @param cId article id
      */
     public void setcId(Integer cId) {
         this.cId = cId;
     }

     /**
      * Tag id
      * @return m_id tag id
      */
     public Integer getmId() {
         return mId;
     }

     /**
      * Tag id
      * @param mId tag id
      */
     public void setmId(Integer mId) {
         this.mId = mId;
     }
}