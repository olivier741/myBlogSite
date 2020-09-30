package com.hak.config.security;

import com.hak.mysite.model.TMenu;
import com.hak.mysite.model.TRoles;
import com.hak.mysite.model.vo.TMenuAndRoleVo;
import com.hak.mysite.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * @author hak
 * @description 自定义权限资源过滤器，实现动态的权限验证
 * 它的主要责任就是当访问一个url时，返回这个url所需要的访问权限
 * @date 2020/8/26
 */
@Component
public class MyFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuService menuService;

    /**
     * 返回本次访问需要的权限，可以有多个权限
     *
     * @param object
     * @Return java.util.Collection<org.springframework.security.access.ConfigAttribute>
     * @Exception Exception
     * @author hak
     * @date 2020/8/26
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        //去数据库查询资源
        List<TMenuAndRoleVo> allMenu = menuService.getAllTMenuAndRoleList();
        for (TMenuAndRoleVo menu : allMenu) {
            if (requestUrl.contains(menu.getMenuUrl()) && menu.getRoleList().size() > 0) {
                List<TRoles> roles = menu.getRoleList();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getRoleName();
                }
                //logger.info("当前访问路径是{},这个url所需要的访问权限是{}", requestUrl, values);
                return SecurityConfig.createList(values);
            }
        }
        //logger.info("当前访问路径是{},这个url所需要的访问权限是{}", requestUrl, "ROLE_LOGIN");
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    /**
     * 此处方法如果做了实现，返回了定义的权限资源列表，
     * Spring Security会在启动时校验每个ConfigAttribute是否配置正确，
     * 如果不需要校验，这里实现方法，方法体直接返回null即可。
     *
     * @param
     * @Return java.util.Collection<org.springframework.security.access.ConfigAttribute>
     * @Exception Exception
     * @author hak
     * @date 2020/8/26
     */
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    /**
     * 法返回类对象是否支持校验，
     * web项目一般使用FilterInvocation来判断，或者直接返回true
     *
     * @param clazz
     * @Return boolean
     * @Exception Exception
     * @author hak
     * @date 2020/8/26
     */
    @Override
    public boolean supports(Class<?> clazz) {

        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
