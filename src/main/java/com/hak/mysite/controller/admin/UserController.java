package com.hak.mysite.controller.admin;

import com.github.pagehelper.PageInfo;
import com.hak.base.RestDto;
import com.hak.base.SearchData;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.vo.TUsersVo;
import com.hak.mysite.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author hak
 * @description comments
 * @date 2020/8/8
 */
@Api("User Action")
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("User List")
    @GetMapping(value = {"/list"})
    @ResponseBody
    public RestDto list(final Pageable pageable, final SearchData searchData) throws Exception{

        PageInfo<TUsers> list = userService.getTUsersList(pageable);

        return RestDto.layUISuccess(list);
    }

    @ApiOperation("Query User")
    @GetMapping("/get/{uId}")
    @ResponseBody
    public RestDto getInfo(@PathVariable Integer uId) throws Exception{
        TUsersVo tUsersVo = userService.getUserInfo(uId);
        return RestDto.success(tUsersVo);
    }

    @ApiOperation("Add User")
    @PostMapping("/add/{stat}")
    @ResponseBody
    public RestDto add(TUsersVo tUsersVo,@PathVariable String stat) throws Exception{
        if ("ad".equals(stat)){
            long count = userService.checkUserName(tUsersVo);
            if (count == 0){
                int i = userService.addTUsers(tUsersVo);
                return RestDto.success();
            }
            return RestDto.error("Username already exists");
        }else if ("ed".equals(stat)){
            int i = userService.saveTUsers(tUsersVo);
            return RestDto.success();
        }
        return null;
    }

    @ApiOperation("User Delete")
    @DeleteMapping("del/{cid}")
    @ResponseBody
    public RestDto delete(@PathVariable int cid) throws Exception{

        int i = userService.deleteTUsersById(cid);

        return RestDto.success();
    }

    @ApiOperation("Delete Verification")
    @PostMapping("/checkDel/pwd")
    @ResponseBody
    public RestDto checkPwd(String pwd) throws Exception{

        if ("123".equals(pwd)){
            return RestDto.success();
        }
        return RestDto.error("The password is wrong");
    }



}