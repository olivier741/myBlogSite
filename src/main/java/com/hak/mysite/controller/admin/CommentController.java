package com.hak.mysite.controller.admin;

import com.github.pagehelper.PageInfo;
import com.hak.base.RestDto;
import com.hak.base.SearchData;
import com.hak.mysite.model.TComments;
import com.hak.mysite.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hak
 * @description 评论
 * @date 2020/8/8
 */
@Api("评论操作")
@Controller
@RequestMapping(value = "/admin/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @ApiOperation("评论列表")
    @GetMapping(value = {"/list"})
    @ResponseBody
    public RestDto list(final Pageable pageable, final SearchData searchData) throws Exception{

        PageInfo<TComments> list = commentService.getTCommentsList(pageable,"","");

        return RestDto.layUISuccess(list);
    }

    @ApiOperation("评论删除")
    @DeleteMapping("del/{cid}")
    @ResponseBody
    public RestDto delete(@PathVariable int cid) throws Exception{

        int i = commentService.deleteTCommentById(cid);

        return RestDto.success();
    }

    @ApiOperation("评论删除")
    @DeleteMapping("/batchDel")
    @ResponseBody
    public RestDto batchDel(@RequestParam(value = "list[]",required = false) List list) throws Exception{

        int i = commentService.batchDeleteTComment(list);

        return RestDto.success();
    }


}
