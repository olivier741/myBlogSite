package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
/**
 * Menu table
 * @author hak 2020-09-14
 */
@ApiModel("Menu Table")
public class TMenu {
    /**
     * id
     */
    @ApiModelProperty("id")
    private Integer meId;

    /**
     * Menu name
     */
    @ApiModelProperty("Menu Name")
    private String menuName;

    /**
     * Menu url
     */
    @ApiModelProperty("Menu url")
    private String menuUrl;

    /**
     * Menu type
     */
    @ApiModelProperty("Menu Type")
    private Integer menuType;

    /**
     * Superior id
     */
    @ApiModelProperty("upper id")
    private Integer parentId;

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
     * Icon
     */
    @ApiModelProperty("icon")
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
     * Menu name
     * @return menu_name menu name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * Menu name
     * @param menuName menu name
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null? null: menuName.trim();
    }

    /**
     * Menu url
     * @return menu_url menu url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * Menu url
     * @param menuUrl menu url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null? null: menuUrl.trim();
    }

    /**
     * Menu type
     * @return menu_type menu type
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * Menu type
     * @param menuType menu type
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * Superior id
     * @return parent_id parent id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Superior id
     * @param parentId parent id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * Icon
     * @return menu_img icon
     */
    public String getMenuImg() {
        return menuImg;
    }

    /**
     * Icon
     * @param menuImg icon
     */
    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg == null? null: menuImg.trim();
    }
}