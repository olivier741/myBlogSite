package com.hak.base.controller;

import com.hak.base.RestDto;
import com.hak.base.service.CodeService;
import com.hak.mysite.mapper.TCodeMapper;
import com.hak.mysite.model.TCode;
import com.hak.mysite.model.TCodeExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hak
 * @description
 * @date 2020/8/20
 */
@Api("Code")
@RestController
@RequestMapping(value = "/admin/base")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @ApiOperation("获取码值")
    @GetMapping("/getCode/{code}")
    public RestDto getCode(@PathVariable String code, HttpServletRequest request) throws Exception{
        List list = codeService.getCodeList(code);
        return RestDto.success(list);
    }
}
