package com.hak.mysite.controller.admin;

import com.github.pagehelper.PageInfo;
import com.hak.base.RestDto;
import com.hak.base.SearchData;
import com.hak.mysite.model.TComments;
import com.hak.mysite.model.TMetas;
import com.hak.mysite.service.CommentService;
import com.hak.mysite.service.MetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hak
 * @description 评论
 * @date 2020/8/8
 */
@Api("标签操作")
@Controller
@RequestMapping(value = "/admin/meta")
public class MetaController {

    @Autowired
    MetaService metaService;

    @ApiOperation("标签列表")
    @GetMapping(value = {"/list"})
    @ResponseBody
    public RestDto list(final Pageable pageable, final SearchData searchData) throws Exception{

        PageInfo<TMetas> list = metaService.getMetaList(pageable);

        return RestDto.layUISuccess(list);
    }

    @ApiOperation("评论删除")
    @DeleteMapping("del/{cid}")
    @ResponseBody
    public RestDto delete(@PathVariable int cid) throws Exception{

        int i = metaService.deleteMetaById(cid);

        return RestDto.success();
    }


}
