package com.hak.config.security;

import com.alibaba.fastjson.JSON;
import com.hak.base.RestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hak
 * @description
 * @date 2020/8/13
 */
@Component
public class MyLoginFailureHandler implements AuthenticationFailureHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

      String msg = "";
         if (e instanceof BadCredentialsException ||
                 e instanceof UsernameNotFoundException) {
             msg = "The account name or password is entered incorrectly";
         } else if (e instanceof LockedException) {
             msg = "The account is locked, please contact the administrator";
         } else if (e instanceof CredentialsExpiredException) {
             msg = "Password expired, please contact the administrator";
         } else if (e instanceof AccountExpiredException) {
             msg = "Account expired, please contact the administrator";
         } else if (e instanceof DisabledException) {
             msg = "The account is disabled, please contact the administrator";
         } else {
             msg = "Login failed";
         }

         logger.info("Login failed");
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        httpServletResponse.getWriter().write(JSON.toJSON(RestDto.error(msg)).toString());
        httpServletResponse.getWriter().flush();
        httpServletResponse.getWriter().close();
    }
}
