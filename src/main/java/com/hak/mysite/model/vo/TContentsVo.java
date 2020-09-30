package com.hak.mysite.model.vo;

import com.hak.mysite.model.TContents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 文章表
 * @author hak 2020-09-10
 */
@ApiModel("文章拓展类 ")
@Data
public class TContentsVo extends TContents {

    private String screenName;

    private String categoriesName;

    private String statusName;

}