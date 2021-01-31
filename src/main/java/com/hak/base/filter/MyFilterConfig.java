package com.hak.base.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hak
 * @description
 * @date 2020/9/10
 */
//@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean reqResFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        StaticResourceFilter staticResourceFilter = new StaticResourceFilter();
        filterRegistrationBean.setFilter(staticResourceFilter);
     // Configure filtering rules
        filterRegistrationBean.addUrlPatterns("*.js","*.html","*.css");
        return filterRegistrationBean;
    }
}
