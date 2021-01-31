package com.hak.mysite.controller;

import com.hak.base.controller.BaseController;
import com.hak.mysite.model.TContents;
import com.hak.mysite.service.HomeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/7/28
 */
@Controller
public class HomeController extends BaseController {

    @Autowired
    HomeService homeService;


    @ApiOperation("blog Home")
    @GetMapping(value = {"home","/","index"})
    public String  home() {

        return "site/index";
    }

    @ApiOperation("blog list")
    @GetMapping("blog")
    public String  blog(HttpServletRequest request) throws Exception{
        List<TContents> list = homeService.getAllContentsList();
        request.setAttribute("articles", list);
        return "site/content";
    }

    @ApiOperation("Article details")
    @GetMapping("single/{cid}")
    public String  single(@PathVariable int cid, HttpServletRequest request) throws Exception{
        TContents tContents = homeService.getContentsById(cid);
        request.setAttribute("tContents", tContents);
        return "site/single";
    }

    @ApiOperation("About page")
    @GetMapping("about")
    public String  about() {

        return "site/about";
    }

    @ApiOperation("Contact page")
    @GetMapping("contact")
    public String  contact() {

        return "site/contact";
    }
}
