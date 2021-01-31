package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Code table
 * @author hak 2020-09-14
 */
@ApiModel("stopwatch")
public class TCode {
    /**
     * id
     */
    @ApiModelProperty("id")
    private Integer id;

    /**
     * Table Name
     */
    @ApiModelProperty("table name")
    private String tableName;

    /**
     * Field name
     */
    @ApiModelProperty("Field Name")
    private String code;

    /**
     * Code value
     */
    @ApiModelProperty("Code Value")
    private String codeValue;

    /**
     * Code value name
     */
    @ApiModelProperty("Code value name")
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
     * Table Name
     * @return table_name table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Table Name
     * @param tableName table name
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null? null: tableName.trim();
    }

    /**
     * Field name
     * @return code field name
     */
    public String getCode() {
        return code;
    }

    /**
     * Field name
     * @param code field name
     */
    public void setCode(String code) {
        this.code = code == null? null: code.trim();
    }

    /**
     * Code value
     * @return code_value code value
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Code value
     * @param codeValue code value
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null? null: codeValue.trim();
    }

    /**
     * Code value name
     * @return code_name code value name
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Code value name
     * @param codeName code value name
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName == null? null: codeName.trim();
    }
}