package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Log sheet
 * @author hak 2020-09-14
 */
@ApiModel("log table")
public class TLogs {
    /**
     * Log id
     */
    @ApiModelProperty("log id")
    private Integer id;

    /**
     * Event
     */
    @ApiModelProperty("Event")
    private String action;

    /**
     * Data
     */
    @ApiModelProperty("Data")
    private String data;

    /**
     * User id
     */
    @ApiModelProperty("User id")
    private Integer authorId;

    /**
     * ip address
     */
    @ApiModelProperty("ip address")
    private String ip;

    /**
     * Creation time
     */
    @ApiModelProperty("Creation Time")
    private Integer created;

    /**
     * Log id
     * @return id log id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Log id
     * @param id log id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Event
     * @return action event
     */
    public String getAction() {
        return action;
    }

    /**
     * Event
     * @param action event
     */
    public void setAction(String action) {
        this.action = action == null? null: action.trim();
    }

    /**
     * Data
     * @return data data
     */
    public String getData() {
        return data;
    }

    /**
     * Data
     * @param data data
     */
    public void setData(String data) {
        this.data = data == null? null: data.trim();
    }

    /**
     * User id
     * @return author_Id user id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * User id
     * @param authorId user id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * ip address
     * @return ip ip address
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip address
     * @param ip ip address
     */
    public void setIp(String ip) {
        this.ip = ip == null? null: ip.trim();
    }

    /**
     * Creation time
     * @return created creation time
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * Creation time
     * @param created creation time
     */
    public void setCreated(Integer created) {
        this.created = created;
    }
}