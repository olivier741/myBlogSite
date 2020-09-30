package com.hak.mysite.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 日志表
 * @author hak 2020-09-14
 */
@ApiModel("日志表")
public class TLogs {
    /**
     * 日志id
     */
    @ApiModelProperty("日志id")
    private Integer id;

    /**
     * 事件
     */
    @ApiModelProperty("事件")
    private String action;

    /**
     * 数据
     */
    @ApiModelProperty("数据")
    private String data;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer authorId;

    /**
     * ip地址
     */
    @ApiModelProperty("ip地址")
    private String ip;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Integer created;

    /**
     * 日志id
     * @return id 日志id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 日志id
     * @param id 日志id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 事件
     * @return action 事件
     */
    public String getAction() {
        return action;
    }

    /**
     * 事件
     * @param action 事件
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 数据
     * @return data 数据
     */
    public String getData() {
        return data;
    }

    /**
     * 数据
     * @param data 数据
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * 用户id
     * @return author_Id 用户id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 用户id
     * @param authorId 用户id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * ip地址
     * @return ip ip地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip地址
     * @param ip ip地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 创建时间
     * @return created 创建时间
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     */
    public void setCreated(Integer created) {
        this.created = created;
    }
}