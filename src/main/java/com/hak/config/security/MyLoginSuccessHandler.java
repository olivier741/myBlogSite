package com.hak.config.security;

import com.alibaba.fastjson.JSON;
import com.hak.base.RestDto;
import com.hak.config.redis.RedisObjectOperation;
import com.hak.config.redis.RedisOperation;
import com.hak.mysite.model.vo.LoginUser;
import com.hak.utils.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hak
 * @description
 * @date 2020/8/13
 */
@Component
public class MyLoginSuccessHandler implements AuthenticationSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RedisOperation redisOperation;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        LoginUser loginUser = (LoginUser)authentication.getPrincipal();
        String uuid = CommonUtil.creatUUID();
        //httpServletResponse.setHeader(uuid);

       // redisOperation.StringSet(loginUser.getUId().toString(),JSON.toJSON(loginUser).toString());
        logger.info("login successful", authentication);
   /*     httpServletResponse.sendRedirect("/admin/index");*/

        //httpServletResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        httpServletResponse.getWriter().write(JSON.toJSON(RestDto.success()).toString());
        httpServletResponse.getWriter().flush();
        httpServletResponse.getWriter().close();

    }
}
