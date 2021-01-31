package com.hak.base.filter;

import com.hak.base.handler.MyGlobalExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hak
 * @description
 * @date 2020/9/10
 */

public class StaticResourceFilter implements Filter {


    private static final Logger logger = LoggerFactory.getLogger(MyGlobalExceptionHandler.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       logger.info("--------- Filter is on -----------");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;


    }

    @Override
    public void destroy() {

    }
}
