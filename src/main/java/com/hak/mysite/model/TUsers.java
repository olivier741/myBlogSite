package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * user table
 * @author hak 2020-09-14
 */
@ApiModel("User Table")
public class TUsers {
    /**
     * User id
     */
    @ApiModelProperty("User id")
    private Integer uId;

    /**
     * Login user name
     */
    @ApiModelProperty("Login Username")
    private String userName;

    /**
     * Password
     */
    @ApiModelProperty("Password")
    private String passWord;

    /**
     * Email
     */
    @ApiModelProperty("Mailbox")
    private String email;

    /**
     * url address
     */
    @ApiModelProperty("url address")
    private String homeUrl;

    /**
     * Display name
     */
    @ApiModelProperty("Display name")
    private String screenName;

    /**
     * Change the time
     */
    @ApiModelProperty("modification time")
    private Date modified;

    /**
     * Remarks
     */
    @ApiModelProperty("Remarks")
    private String ps;

    /**
     *
     */
    @ApiModelProperty("")
    private Integer logged;

    /**
     * user group
     */
    @ApiModelProperty("User Group")
    private Integer groupType;

    /**
     * Is it locked
     */
    @ApiModelProperty("Is it locked")
    private Integer locked;

    /**
     * User id
     * @return u_id user id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * User id
     * @param uId user id
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * Login user name
     * @return user_name login user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Login user name
     * @param userName login user name
     */
    public void setUserName(String userName) {
        this.userName = userName == null? null: userName.trim();
    }

    /**
     * Password
     * @return pass_word password
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Password
     * @param passWord password
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null? null: passWord.trim();
    }

    /**
     * Email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null? null: email.trim();
    }

    /**
     * url address
     * @return home_url url address
     */
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * url address
     * @param homeUrl url address
     */
    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl == null? null: homeUrl.trim();
    }

    /**
     * Display name
     * @return screen_name display name
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * Display name
     * @param screenName display name
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName == null? null: screenName.trim();
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
     * Remarks
     * @return ps Remarks
     */
    public String getPs() {
        return ps;
    }

    /**
     * Remarks
     * @param ps remark
     */
    public void setPs(String ps) {
        this.ps = ps == null? null: ps.trim();
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
     * user group
     * @return group_type user group
     */
    public Integer getGroupType() {
        return groupType;
    }

    /**
     * user group
     * @param groupType user group
     */
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    /**
     * Is it locked
     * @return locked is it locked
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * Is it locked
     * @param locked is it locked
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}