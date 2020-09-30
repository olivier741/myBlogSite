package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 评论表
 * @author hak 2020-09-14
 */
@ApiModel("评论表")
public class TComments {
    /**
     * 评论id
     */
    @ApiModelProperty("评论id")
    private Integer coId;

    /**
     * 文章id
     */
    @ApiModelProperty("文章id")
    private Integer cId;

    /**
     * 评论者名称
     */
    @ApiModelProperty("评论者名称")
    private String author;

    /**
     * 评论者id
     */
    @ApiModelProperty("评论者id")
    private Integer authorId;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String mail;

    /**
     * url
     */
    @ApiModelProperty("url")
    private String url;

    /**
     * IP地址
     */
    @ApiModelProperty("IP地址")
    private String ip;

    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private String status;

    /**
     * 上级id
     */
    @ApiModelProperty("上级id")
    private Integer parent;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date created;

    /**
     * 评论内容
     */
    @ApiModelProperty("评论内容")
    private String content;

    /**
     * 评论id
     * @return co_id 评论id
     */
    public Integer getCoId() {
        return coId;
    }

    /**
     * 评论id
     * @param coId 评论id
     */
    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    /**
     * 文章id
     * @return c_id 文章id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 文章id
     * @param cId 文章id
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 评论者名称
     * @return author 评论者名称
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 评论者名称
     * @param author 评论者名称
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 评论者id
     * @return author_id 评论者id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 评论者id
     * @param authorId 评论者id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * 邮箱
     * @return mail 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 邮箱
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * url
     * @return url url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * IP地址
     * @return ip IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * IP地址
     * @param ip IP地址
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 上级id
     * @return parent 上级id
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 上级id
     * @param parent 上级id
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * 创建时间
     * @return created 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 评论内容
     * @return content 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 评论内容
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}