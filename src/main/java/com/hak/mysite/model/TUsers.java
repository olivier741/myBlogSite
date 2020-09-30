package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 用户表
 * @author hak 2020-09-14
 */
@ApiModel("用户表")
public class TUsers {
    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private Integer uId;

    /**
     * 登陆用户名
     */
    @ApiModelProperty("登陆用户名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String passWord;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * url地址
     */
    @ApiModelProperty("url地址")
    private String homeUrl;

    /**
     * 显示姓名
     */
    @ApiModelProperty("显示姓名")
    private String screenName;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date modified;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String ps;

    /**
     * 
     */
    @ApiModelProperty("")
    private Integer logged;

    /**
     * 用户组
     */
    @ApiModelProperty("用户组")
    private Integer groupType;

    /**
     * 是否锁定
     */
    @ApiModelProperty("是否锁定")
    private Integer locked;

    /**
     * 用户id
     * @return u_id 用户id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 用户id
     * @param uId 用户id
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * 登陆用户名
     * @return user_name 登陆用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 登陆用户名
     * @param userName 登陆用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return pass_word 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 密码
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * url地址
     * @return home_url url地址
     */
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * url地址
     * @param homeUrl url地址
     */
    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl == null ? null : homeUrl.trim();
    }

    /**
     * 显示姓名
     * @return screen_name 显示姓名
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * 显示姓名
     * @param screenName 显示姓名
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName == null ? null : screenName.trim();
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
     * 备注
     * @return ps 备注
     */
    public String getPs() {
        return ps;
    }

    /**
     * 备注
     * @param ps 备注
     */
    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }

    /**
     * 
     * @return logged 
     */
    public Integer getLogged() {
        return logged;
    }

    /**
     * 
     * @param logged 
     */
    public void setLogged(Integer logged) {
        this.logged = logged;
    }

    /**
     * 用户组
     * @return group_type 用户组
     */
    public Integer getGroupType() {
        return groupType;
    }

    /**
     * 用户组
     * @param groupType 用户组
     */
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    /**
     * 是否锁定
     * @return locked 是否锁定
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * 是否锁定
     * @param locked 是否锁定
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}