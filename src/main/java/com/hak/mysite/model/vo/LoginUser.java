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
 * 登陆用户信息
 * @author hak 2020-08-26
 */
@ApiModel("登陆用户信息")
@Data
public class LoginUser implements UserDetails {
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
     * 角色
     */
    @ApiModelProperty("角色")
    private String roleName;

    /**
     * 是否锁定
     */
    @ApiModelProperty("是否锁定")
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
        return locked == 1?true:false;
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