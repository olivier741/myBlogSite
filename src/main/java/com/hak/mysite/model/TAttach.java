package com.hak.mysite.model;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/**
 * Annex table
 *
 * @author hak 2020-09-14
 */
@ApiModel("Attachment Table")
public class TAttach {

    /**
     *
     */
    @ApiModelProperty("")
    private Integer aId;

    /**
     *
     */
    @ApiModelProperty("")
    private String fileName;

    /**
     *
     */
    @ApiModelProperty("")
    private Long fileSize;

    /**
     *
     */
    @ApiModelProperty("")
    private String fileUrl;

    /**
     *
     */
    @ApiModelProperty("")
    private Date created;

    /**
     *
     */
    @ApiModelProperty("")
    private String ps;

    /**
     *
     */
    @ApiModelProperty("")
    private Integer cId;

    /**
     *
     * @return a_id
     */
    public Integer getaId() {
        return aId;
    }

    /**
     *
     * @param aId
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     *
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     *
     * @return file_size
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     *
     * @return file_url
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     *
     * @param fileUrl
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     *
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     *
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     *
     * @return ps
     */
    public String getPs() {
        return ps;
    }

    /**
     *
     * @param ps
     */
    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }

    /**
     *
     * @return c_id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     *
     * @param cId
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
