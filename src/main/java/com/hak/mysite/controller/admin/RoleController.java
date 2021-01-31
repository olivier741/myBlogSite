package com.hak.mysite.controller.admin;

import com.github.pagehelper.PageInfo;
import com.hak.base.RestDto;
import com.hak.base.SearchData;
import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TRoles;
import com.hak.mysite.model.TUsers;
import com.hak.mysite.model.vo.TRolesVo;
import com.hak.mysite.service.RoleService;
import com.hak.mysite.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author hak
 * @description comments
 * @date 2020/8/8
 */
@Api("role")
@Controller
@RequestMapping(value = "/admin/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @ApiOperation("Role List")
    @GetMapping(value = {"/list"})
    @ResponseBody
    public RestDto list(final Pageable pageable, final SearchData searchData) throws Exception{

        PageInfo<TRoles> list = roleService.getAllRoleList(pageable);

        return RestDto.layUISuccess(list);
    }

    @ApiOperation("Role drop-down selection")
    @GetMapping("/selectList")
    @ResponseBody
    public RestDto selectList() throws Exception{
        List list = roleService.selectList();

        return RestDto.success(list);
    }

    @ApiOperation("Add role")
    @PostMapping(value = {"/add"})
    @ResponseBody
    public RestDto addRole(TRoles roles) throws Exception{
        roleService.addRole(roles);
        return RestDto.success();
    }

    @ApiOperation("Permission List")
    @GetMapping(value = {"/get/{id}"})
    @ResponseBody
    public RestDto getRole(@PathVariable Integer id) throws Exception{
        Map<String,List> map = roleService.getMenuAndRoleByRId(id);
        return RestDto.success(map);
    }

    @ApiOperation("Edit menu permissions")
    @PostMapping(value = {"/menu/edit/{id}"})
    @ResponseBody
    public RestDto menuEdit(@PathVariable Integer id, @RequestBody List<Map> list) throws Exception{
        roleService.updateMenuByRId(id,list);
        return RestDto.success();
    }

    @ApiOperation("Delete Role")
    @DeleteMapping(value = {"/del/{id}"})
    @ResponseBody
    public RestDto delRole(@PathVariable Integer id) throws Exception{

        if (roleService.checkDeleteRoleByRId(id)){
            int i = roleService.deleteRoleByRId(id);
            return RestDto.success(i);
        }else {
            return RestDto.error("User information exists under this role");
        }

    }

}