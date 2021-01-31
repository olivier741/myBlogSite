package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Article table
 * @author hak 2020-09-14
 */
@ApiModel("Article Table")
public class TContents {
    /**
     * Article id
     */
    @ApiModelProperty("Article id")
    private Integer cId;

    /**
     * Title
     */
    @ApiModelProperty("title")
    private String title;

    /**
     * Description
     */
    @ApiModelProperty("Description")
    private String titlePic;

    /**
     * Creation time
     */
    @ApiModelProperty("Creation Time")
    private Date created;

    /**
     * Change the time
     */
    @ApiModelProperty("modification time")
    private Date modified;

    /**
     * Use €卛d
     */
    @ApiModelProperty("Hua 滆€卛d")
    private Integer authorId;

    /**
     *
     */
    @ApiModelProperty("")
    private String type;

    /**
     * Status
     */
    @ApiModelProperty("Status")
    private Integer status;

    /**
     * Label
     */
    @ApiModelProperty("tag")
    private String tags;

    /**
     * Classification
     */
    @ApiModelProperty("Classification")
    private Integer categories;

    /**
     * Reading volume
     */
    @ApiModelProperty("reading volume")
    private Integer hits;

    /**
     * Number of comments
     */
    @ApiModelProperty("number of comments")
    private Integer commentsNum;

    /**
     * Whether to allow comments
     */
    @ApiModelProperty("Do you allow comments")
    private Integer allowComment;

    /**
     *
     */
    @ApiModelProperty("")
    private Integer allowPing;

    /**
     *
     */
    @ApiModelProperty("")
    private Integer allowFeed;

    /**
     * Article content
     */
    @ApiModelProperty("article content")
    private String content;

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
     * Title
     * @return title title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title == null? null: title.trim();
    }

    /**
     * Description
     * @return title_Pic description
     */
    public String getTitlePic() {
        return titlePic;
    }

    /**
     * Description
     * @param titlePic description
     */
    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic == null? null: titlePic.trim();
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
     * Use €卛d
     * @return author_id 廆€卛d
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * Use €卛d
     * @param authorId 廆€卛d
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type == null? null: type.trim();
    }

    /**
     * Status
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Label
     * @return tags tag
     */
    public String getTags() {
        return tags;
    }

    /**
     * Label
     * @param tags tag
     */
    public void setTags(String tags) {
        this.tags = tags == null? null: tags.trim();
    }

    /**
     * Classification
     * @return categories
     */
    public Integer getCategories() {
        return categories;
    }

    /**
     * Classification
     * @param categories
     */
    public void setCategories(Integer categories) {
        this.categories = categories;
    }

    /**
     * Reading volume
     * @return hits reading
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * Reading volume
     * @param hits reading
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * Number of comments
     * @return comments_num number of comments
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * Number of comments
     * @param commentsNum number of comments
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }
   /**
     * Whether to allow comments
     * @return allow_comment Whether to allow comments
     */
    public Integer getAllowComment() {
        return allowComment;
    }

    /**
     * Whether to allow comments
     * @param allowComment whether to allow comments
     */
    public void setAllowComment(Integer allowComment) {
        this.allowComment = allowComment;
    }

    /**
     *
     * @return allow_ping
     */
    public Integer getAllowPing() {
        return allowPing;
    }

    /**
     *
     * @param allowPing
     */
    public void setAllowPing(Integer allowPing) {
        this.allowPing = allowPing;
    }

    /**
     *
     * @return allow_feed
     */
    public Integer getAllowFeed() {
        return allowFeed;
    }

    /**
     *
     * @param allowFeed
     */
    public void setAllowFeed(Integer allowFeed) {
        this.allowFeed = allowFeed;
    }

    /**
     * Article content
     * @return content Article content
     */
    public String getContent() {
        return content;
    }

    /**
     * Article content
     * @param content article content
     */
    public void setContent(String content) {
        this.content = content == null? null: content.trim();
    }
}