package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Label table
 * @author hak 2020-09-14
 */
@ApiModel("tag table")
public class TMetas {
    /**
     * Tag id
     */
    @ApiModelProperty("tag id")
    private Integer mId;

    /**
     * Name
     */
    @ApiModelProperty("Name")
    private String name;

    /**
     * Types of
     */
    @ApiModelProperty("Type")
    private String type;

    /**
     * Description
     */
    @ApiModelProperty("Description")
    private String description;

    /**
     * Change the time
     */
    @ApiModelProperty("modification time")
    private Date modified;

    /**
     *
     */
    @ApiModelProperty("")
    private Integer parent;

    /**
     * operator
     */
    @ApiModelProperty("Operator")
    private Integer uId;

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

    /**
     * Name
     * @return name name
     */
    public String getName() {
        return name;
    }

    /**
     * Name
     * @param name name
     */
    public void setName(String name) {
        this.name = name == null? null: name.trim();
    }

    /**
     * Types of
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Types of
     * @param type
     */
    public void setType(String type) {
        this.type = type == null? null: type.trim();
    }

    /**
     * Description
     * @return description description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description == null? null: description.trim();
    }

    /**
     * Change the time
     * @return modified modification time
     */
    public Date getModified() {
        return modified;
    }

    /**
     * Change the time
     * @param modified modification time
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     *
     * @return parent
     */
    public Integer getParent() {
        return parent;
    }

    /**
     *
     * @param parent
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * operator
     * @return u_id operator
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * operator
     * @param uId operator
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }
}