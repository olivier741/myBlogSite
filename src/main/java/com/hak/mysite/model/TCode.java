package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 码表
 * @author hak 2020-09-14
 */
@ApiModel("码表")
public class TCode {
    /**
     * id
     */
    @ApiModelProperty("id")
    private Integer id;

    /**
     * 表名
     */
    @ApiModelProperty("表名")
    private String tableName;

    /**
     * 字段名
     */
    @ApiModelProperty("字段名")
    private String code;

    /**
     * 码值
     */
    @ApiModelProperty("码值")
    private String codeValue;

    /**
     * 码值名称
     */
    @ApiModelProperty("码值名称")
    private String codeName;

    /**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 表名
     * @return table_name 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 表名
     * @param tableName 表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 字段名
     * @return code 字段名
     */
    public String getCode() {
        return code;
    }

    /**
     * 字段名
     * @param code 字段名
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 码值
     * @return code_value 码值
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * 码值
     * @param codeValue 码值
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * 码值名称
     * @return code_name 码值名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 码值名称
     * @param codeName 码值名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }
}