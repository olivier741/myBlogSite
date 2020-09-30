package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * 菜单表
 * @author hak 2020-09-14
 */
@ApiModel("菜单表")
public class TMenu {
    /**
     * id
     */
    @ApiModelProperty("id")
    private Integer meId;

    /**
     * 菜单名称
     */
    @ApiModelProperty("菜单名称")
    private String menuName;

    /**
     * 菜单url
     */
    @ApiModelProperty("菜单url")
    private String menuUrl;

    /**
     * 菜单类型
     */
    @ApiModelProperty("菜单类型")
    private Integer menuType;

    /**
     * 上级id
     */
    @ApiModelProperty("上级id")
    private Integer parentId;

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
     * 图标
     */
    @ApiModelProperty("图标")
    private String menuImg;

    /**
     * id
     * @return me_id id
     */
    public Integer getMeId() {
        return meId;
    }

    /**
     * id
     * @param meId id
     */
    public void setMeId(Integer meId) {
        this.meId = meId;
    }

    /**
     * 菜单名称
     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 菜单url
     * @return menu_url 菜单url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 菜单url
     * @param menuUrl 菜单url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 菜单类型
     * @return menu_type 菜单类型
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * 菜单类型
     * @param menuType 菜单类型
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * 上级id
     * @return parent_id 上级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 上级id
     * @param parentId 上级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * 图标
     * @return menu_img 图标
     */
    public String getMenuImg() {
        return menuImg;
    }

    /**
     * 图标
     * @param menuImg 图标
     */
    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg == null ? null : menuImg.trim();
    }
}