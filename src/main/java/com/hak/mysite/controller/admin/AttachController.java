package com.hak.mysite.controller.admin;

import com.github.pagehelper.PageInfo;
import com.hak.base.RestDto;
import com.hak.mysite.model.TContents;
import com.hak.mysite.service.ArticleService;
import com.hak.mysite.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hak
 * @description attachment
 * @date 2020/8/8
 */
@Api("annex")
@Controller
@RequestMapping(value = "/admin/attach")
public class AttachController {

    @Autowired
    IndexService indexService;

    @Autowired
    ArticleService articleService;

    @ApiOperation("Article List")
    @GetMapping(value = {"/list"})
    @ResponseBody
    public RestDto list() throws Exception{



        return null;
    }

    @ApiOperation("Attachment upload")
    @GetMapping("/uploadFile}")
    public String single(HttpServletRequest request,
                          HttpServletResponse response,
                          @ApiParam(name = "editormd-image-file", value = "file array", required = true)
                              @RequestParam(name = "editormd-image-file", required = true)
                                      MultipartFile file) throws Exception{



        return "admin/single";
    }

    @ApiOperation("Attachment upload")
    @GetMapping("/uploadMultipleFile}")
    public String multipleFile(@ApiParam(name = "file", value = "file array", required = true)
                               @RequestParam(name = "file", required = true)
                                   MultipartFile[] files){

        return "admin/single";
    }

}