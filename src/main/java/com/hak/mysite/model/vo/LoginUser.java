package com.hak.mysite.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Login user information
 * @author hak 2020-08-26
 */
@ApiModel("Login User Information")
@Data
public class LoginUser implements UserDetails {
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
     * Character
     */
    @ApiModelProperty("role")
    private String roleName;

    /**
     * Is it locked
     */
    @ApiModelProperty("Is it locked")
    private Integer locked;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(roleName));
        return authorities;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return locked == 1? true:false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}