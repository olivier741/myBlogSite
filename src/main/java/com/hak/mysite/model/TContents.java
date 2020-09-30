package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 文章表
 * @author hak 2020-09-14
 */
@ApiModel("文章表")
public class TContents {
    /**
     * 文章id
     */
    @ApiModelProperty("文章id")
    private Integer cId;

    /**
     * 题目
     */
    @ApiModelProperty("题目")
    private String title;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String titlePic;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date created;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date modified;

    /**
     * 浣滆€卛d
     */
    @ApiModelProperty("浣滆€卛d")
    private Integer authorId;

    /**
     * 
     */
    @ApiModelProperty("")
    private String type;

    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private Integer status;

    /**
     * 标签
     */
    @ApiModelProperty("标签")
    private String tags;

    /**
     * 分类
     */
    @ApiModelProperty("分类")
    private Integer categories;

    /**
     * 阅读量
     */
    @ApiModelProperty("阅读量")
    private Integer hits;

    /**
     * 评论数量
     */
    @ApiModelProperty("评论数量")
    private Integer commentsNum;

    /**
     * 是否允许评论
     */
    @ApiModelProperty("是否允许评论")
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
     * 文章内容
     */
    @ApiModelProperty("文章内容")
    private String content;

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
     * 题目
     * @return title 题目
     */
    public String getTitle() {
        return title;
    }

    /**
     * 题目
     * @param title 题目
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 描述
     * @return title_Pic 描述
     */
    public String getTitlePic() {
        return titlePic;
    }

    /**
     * 描述
     * @param titlePic 描述
     */
    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic == null ? null : titlePic.trim();
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
     * 修改时间
     * @return modified 修改时间
     */
    public Date getModified() {
        return modified;
    }

    /**
     * 修改时间
     * @param modified 修改时间
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 浣滆€卛d
     * @return author_id 浣滆€卛d
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * 浣滆€卛d
     * @param authorId 浣滆€卛d
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
        this.type = type == null ? null : type.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 标签
     * @return tags 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 标签
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * 分类
     * @return categories 分类
     */
    public Integer getCategories() {
        return categories;
    }

    /**
     * 分类
     * @param categories 分类
     */
    public void setCategories(Integer categories) {
        this.categories = categories;
    }

    /**
     * 阅读量
     * @return hits 阅读量
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 阅读量
     * @param hits 阅读量
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * 评论数量
     * @return comments_num 评论数量
     */
    public Integer getCommentsNum() {
        return commentsNum;
    }

    /**
     * 评论数量
     * @param commentsNum 评论数量
     */
    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    /**
     * 是否允许评论
     * @return allow_comment 是否允许评论
     */
    public Integer getAllowComment() {
        return allowComment;
    }

    /**
     * 是否允许评论
     * @param allowComment 是否允许评论
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
     * 文章内容
     * @return content 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 文章内容
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}