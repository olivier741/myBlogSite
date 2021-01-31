package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Comment form
 * @author hak 2020-09-14
 */
@ApiModel("Comment Form")
public class TComments {
    /**
     * Comment id
     */
    @ApiModelProperty("Comment id")
    private Integer coId;

    /**
     * Article id
     */
    @ApiModelProperty("Article id")
    private Integer cId;

    /**
     * Commenter's name
     */
    @ApiModelProperty("Commenter Name")
    private String author;

    /**
     * Commenter id
     */
    @ApiModelProperty("commenter id")
    private Integer authorId;

    /**
     * Email
     */
    @ApiModelProperty("Mailbox")
    private String mail;

    /**
     * url
     */
    @ApiModelProperty("url")
    private String url;

    /**
     * IP address
     */
    @ApiModelProperty("IP address")
    private String ip;

    /**
     * Status
     */
    @ApiModelProperty("Status")
    private String status;

    /**
     * Superior id
     */
    @ApiModelProperty("upper id")
    private Integer parent;

    /**
     * Creation time
     */
    @ApiModelProperty("Creation Time")
    private Date created;

    /**
     * comments
     */
    @ApiModelProperty("Comment content")
    private String content;

    /**
     * Comment id
     * @return co_id comment id
     */
    public Integer getCoId() {
        return coId;
    }

    /**
     * Comment id
     * @param coId comment id
     */
    public void setCoId(Integer coId) {
        this.coId = coId;
    }

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
     * Commenter's name
     * @return author commenter name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Commenter's name
     * @param author commenter name
     */
    public void setAuthor(String author) {
        this.author = author == null? null: author.trim();
    }

    /**
     * Commenter id
     * @return author_id commenter id
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * Commenter id
     * @param authorId commenter id
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * Email
     * @return mail mailbox
     */
    public String getMail() {
        return mail;
    }

    /**
     * Email
     * @param mail mailbox
     */
    public void setMail(String mail) {
        this.mail = mail == null? null: mail.trim();
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
        this.url = url == null? null: url.trim();
    }

    /**
     * IP address
     * @return ip IP address
     */
    public String getIp() {
        return ip;
    }

    /**
     * IP address
     * @param ip IP address
     */
    public void setIp(String ip) {
        this.ip = ip == null? null: ip.trim();
    }

    /**
     * Status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null? null: status.trim();
    }

    /**
     * Superior id
     * @return parent superior id
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * Superior id
     * @param parent parent id
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * Creation time
     * @return created creation time
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Creation time
     * @param created creation time
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * comments
     * @return content Comment content
     */
    public String getContent() {
        return content;
    }

    /**
     * comments
     * @param content Comment content
     */
    public void setContent(String content) {
        this.content = content == null? null: content.trim();
    }
}