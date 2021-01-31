package com.hak.mysite.controller.admin;

import com.hak.base.RestDto;
import com.hak.base.controller.BaseController;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import com.hak.mysite.service.IndexService;
import com.hak.mysite.service.MetaService;
import com.hak.mysite.service.UserService;
import com.hak.utils.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

/**
 * @author hak
 * @description background homepage
 * @date 2020/8/8
 */
@Api("Background Homepage")
@Controller
@RequestMapping(value = "/admin")
public class IndexController extends BaseController {

    @Autowired
    IndexService indexService;

    @Autowired
    MetaService metaService;

    @Autowired
    UserService userService;

    @ApiOperation("Enter the homepage")
    @GetMapping(value = {"","/index"})
    public String index(HttpServletRequest request) throws Exception{

        List<TMenuAndRoleVo> list = indexService.getTMenusList(getLoginInfo());
        request.setAttribute("tMenus", list);
        request.setAttribute("UserInfo", getLoginInfo());
        return "admin/index";
    }

    @ApiOperation("Jump console")
    @GetMapping(value = {"/home"})
    public String home() throws Exception{

        return "admin/home/console";
    }


    @ApiOperation("Jump Message")
    @GetMapping(value = {"/message"})
    public String message() throws Exception{

        return "admin/message/message";
    }


    @ApiOperation("Login")
    @GetMapping(value = {"/login"})
    public String login(HttpServletRequest request){

        return "admin/login";
    }

    @ApiOperation("Jump basic information")
    @GetMapping(value = {"/userInfo"})
    public String info() throws Exception{

        return "admin/user/info";
    }

    @ApiOperation("Jump to modify password")
    @GetMapping(value = {"/userPwd"})
    public String pwd() throws Exception{

        return "admin/user/password";
    }

    @ApiOperation("Modify Password")
    @PostMapping(value = {"/userPwd/edit"})
    @ResponseBody
    public RestDto editPwd(String oldPassWord, String newPassWord) throws Exception{

        if (getLoginInfo().getPassword().equals(MD5Util.encode(oldPassWord))){
            int i = userService.editPwd(getLoginInfo(),MD5Util.encode(newPassWord));
        }else {
            return RestDto.error("The original password is wrong");
        }
        return RestDto.success();
    }

    @ApiOperation("Jump Article List")
    @GetMapping(value = {"/article"})
    public String article() throws Exception{

        return "admin/article_list";
    }

    @ApiOperation("Jump to publish article")
    @GetMapping(value = {"/publish"})
    public String publish(HttpServletRequest request) throws Exception{

        List list = metaService.getCategorieList();
        request.setAttribute("tCategories", list);
        return "admin/article_publish";
    }


    @ApiOperation("Jump comment list")
    @GetMapping(value = {"/comment"})
    public String commentList() throws Exception{

        return "/admin/comment_list";
    }

    @ApiOperation("jump tag list")
    @GetMapping(value = {"/meta"})
    public String metaList() throws Exception{

        return "/admin/meta_list";
    }


    @ApiOperation("Jump User List")
    @GetMapping(value = {"/user"})
    public String userList() throws Exception{

        return "/admin/user_list";
    }


    @ApiOperation("jump permission list")
    @GetMapping(value = {"/role"})
    public String roleList() throws Exception{

        return "/admin/role_list";
    }

}